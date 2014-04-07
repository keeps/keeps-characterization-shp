package pt.keep.validator.shp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.nocrala.tools.gis.data.esri.shapefile.ShapeFileReader;
import org.nocrala.tools.gis.data.esri.shapefile.header.ShapeFileHeader;
import org.nocrala.tools.gis.data.esri.shapefile.shape.AbstractShape;

import pt.keep.validator.shp.result.FeaturesInfo;
import pt.keep.validator.shp.result.FileInfo;
import pt.keep.validator.shp.result.IdentificationInfo;
import pt.keep.validator.shp.result.RecordStats;
import pt.keep.validator.shp.result.Result;
import pt.keep.validator.shp.result.ValidationInfo;

public class ShapefileProcessor {
	private static String version = "1.0";

	public String getVersion(){
		return version;
	}
	public String run(File f) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			Result res = process(f);
			JAXBContext jaxbContext = JAXBContext.newInstance(Result.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(res, bos);
			return bos.toString("UTF-8");
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return null;
	}

	public Result process(File f) {
		Result res = new Result();
		try {
			FileInputStream fis = new FileInputStream(f);
			ShapeFileReader r = new ShapeFileReader(fis);
			ShapeFileHeader h = r.getHeader();
			IdentificationInfo identificationInfo = new IdentificationInfo();
			identificationInfo.setVersion(h.getVersion());
			res.setIdentificationInfo(identificationInfo);
			ValidationInfo validationInfo = new ValidationInfo();
			validationInfo.setValid(true);
			res.setValidationInfo(validationInfo);
			FeaturesInfo featuresInfo = new FeaturesInfo();
			featuresInfo.setFileInfo(extractInfo(h));
			featuresInfo.setRecordStats(extractRecordsInfo(r));
			res.setFeaturesInfo(featuresInfo);
			
		} catch (Exception e) {
			ValidationInfo validationInfo = new ValidationInfo();
			validationInfo.setValid(false);
			validationInfo.setValidationError(e.getMessage());
			res.setValidationInfo(validationInfo);
		}

		return res;
	}

	private RecordStats extractRecordsInfo(ShapeFileReader r) {
		int counter = 0;
		int counterNullShape = 0;
		int counterPointShape = 0;
		int counterPolylineShape = 0;
		int counterPolygonShape = 0;
		int counterMultiPointShape = 0;
		int counterPointZShape = 0;

		int counterPolyLineZShape = 0;
		int counterPolygonZShape = 0;
		int counterMultiPointZShape = 0;
		int counterPointMShape = 0;
		int counterPolyLineMShape = 0;
		int counterPolygonMShape = 0;
		int counterMultiPointMShape = 0;
		int counterMultiPatchShape = 0;

		try {
			AbstractShape s;
			while ((s = r.next()) != null) {
				switch (s.getShapeType()) {
				case NULL:
					counterNullShape++;
					break;
				case POINT:
					counterPointShape++;
					break;
				case POLYLINE:
					counterPolylineShape++;
					break;
				case POLYGON:
					counterPolygonShape++;
					break;
				case MULTIPOINT:
					counterMultiPointShape++;
					break;
				case POINT_Z:
					counterPointZShape++;
				case POLYLINE_Z:
					counterPolyLineZShape++;
					break;
				case POLYGON_Z:
					counterPolygonZShape++;
					break;
				case MULTIPOINT_Z:
					counterMultiPointZShape++;
					break;
				case POINT_M:
					counterPointMShape++;
				case POLYLINE_M:
					counterPolyLineMShape++;
					break;
				case POLYGON_M:
					counterPolygonMShape++;
					break;
				case MULTIPOINT_M:
					counterMultiPointMShape++;
					break;
				case MULTIPATCH:
					counterMultiPatchShape++;
					break;
				}
				counter++;
			}
			RecordStats shapesInfo = new RecordStats(counter, counterNullShape,
					counterPointShape, counterPolylineShape,
					counterPolygonShape, counterMultiPointShape,
					counterPointZShape, counterPolyLineZShape,
					counterPolygonZShape, counterMultiPointZShape,
					counterPointMShape, counterPolyLineMShape,
					counterPolygonMShape, counterMultiPointMShape,
					counterMultiPatchShape);
			return shapesInfo;
		} catch (Exception e) {
			return null;
		}
	}

	private FileInfo extractInfo(ShapeFileHeader h) {
		FileInfo fi = new FileInfo();
		fi.setBoxMaxM(h.getBoxMaxM());
		fi.setBoxMaxX(h.getBoxMaxX());
		fi.setBoxMaxY(h.getBoxMaxY());
		fi.setBoxMaxZ(h.getBoxMaxZ());
		fi.setBoxMinM(h.getBoxMinM());
		fi.setBoxMinX(h.getBoxMinX());
		fi.setBoxMinY(h.getBoxMinY());
		fi.setBoxMinZ(h.getBoxMinZ());
		fi.setFileCode(h.getFileCode());
		fi.setFileLength(h.getFileLength());
		return fi;
	}

	private void printHelp(Options opts) {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java -jar [jarFile]", opts);
	}
	
	private void printVersion() {
		System.out.println(version);
	}

	public static void main(String[] args) {
		try {
			ShapefileProcessor sfp = new ShapefileProcessor();
			Options options = new Options();
			options.addOption("f", true, "file to analyze");
			options.addOption("v", false, "print this tool version");
			options.addOption("h", false, "print this message");

			CommandLineParser parser = new GnuParser();
			CommandLine cmd = parser.parse(options, args);

			if (cmd.hasOption("h")) {
				sfp.printHelp(options);
				System.exit(0);
			}
			
			if (cmd.hasOption("v")) {
				sfp.printVersion();
				System.exit(0);
			}

			if (!cmd.hasOption("f")) {
				sfp.printHelp(options);
				System.exit(0);
			}

			File f = new File(cmd.getOptionValue("f"));
			if (!f.exists()) {
				System.out.println("File doesn't exist");
				System.exit(0);
			}
			String toolOutput = sfp.run(f);
			if(toolOutput!=null){
				System.out.println(toolOutput);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

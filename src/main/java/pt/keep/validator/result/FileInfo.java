package pt.keep.validator.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "file")
public class FileInfo {
	private double boxMaxM;
	private double boxMaxX;
	private double boxMaxY;
	private double boxMaxZ;
	private double boxMinM;
	private double boxMinX;
	private double boxMinY;
	private double boxMinZ;
	private int fileCode;
	private int fileLength;

	@XmlElement
	public double getBoxMaxM() {
		return boxMaxM;
	}

	public void setBoxMaxM(double boxMaxM) {
		this.boxMaxM = boxMaxM;
	}

	@XmlElement
	public double getBoxMaxX() {
		return boxMaxX;
	}

	public void setBoxMaxX(double boxMaxX) {
		this.boxMaxX = boxMaxX;
	}

	@XmlElement
	public double getBoxMaxY() {
		return boxMaxY;
	}

	public void setBoxMaxY(double boxMaxY) {
		this.boxMaxY = boxMaxY;
	}

	@XmlElement
	public double getBoxMaxZ() {
		return boxMaxZ;
	}

	public void setBoxMaxZ(double boxMaxZ) {
		this.boxMaxZ = boxMaxZ;
	}

	@XmlElement
	public double getBoxMinM() {
		return boxMinM;
	}

	public void setBoxMinM(double boxMinM) {
		this.boxMinM = boxMinM;
	}

	@XmlElement
	public double getBoxMinX() {
		return boxMinX;
	}

	public void setBoxMinX(double boxMinX) {
		this.boxMinX = boxMinX;
	}

	@XmlElement
	public double getBoxMinY() {
		return boxMinY;
	}

	public void setBoxMinY(double boxMinY) {
		this.boxMinY = boxMinY;
	}

	@XmlElement
	public double getBoxMinZ() {
		return boxMinZ;
	}

	public void setBoxMinZ(double boxMinZ) {
		this.boxMinZ = boxMinZ;
	}

	@XmlElement
	public int getFileCode() {
		return fileCode;
	}

	public void setFileCode(int fileCode) {
		this.fileCode = fileCode;
	}

	@XmlElement
	public int getFileLength() {
		return fileLength;
	}

	public void setFileLength(int fileLength) {
		this.fileLength = fileLength;
	}

}

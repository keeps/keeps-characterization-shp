package pt.keep.validator.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "features")
public class FeaturesInfo {
	private FileInfo fileInfo;
	private RecordStats recordStats;
	
	@XmlElement
	public FileInfo getFileInfo() {
		return fileInfo;
	}
	public void setFileInfo(FileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}
	@XmlElement
	public RecordStats getRecordStats() {
		return recordStats;
	}
	public void setRecordStats(RecordStats recordStats) {
		this.recordStats = recordStats;
	}
	
	
}

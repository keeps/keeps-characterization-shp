package pt.keep.validator.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "identification")
public class IdentificationInfo {

	private int version;

	public IdentificationInfo() {
		this.version = 0;
	}

	public IdentificationInfo(int version) {
		this.version = version;
	}

	@XmlElement
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}

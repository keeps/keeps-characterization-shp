package pt.keep.validator.result;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "shapefileCharacterizationResult")
@XmlType(propOrder = { "identificationInfo","validationInfo", "featuresInfo"})
public class Result {

	private IdentificationInfo identificationInfo;
	
	private ValidationInfo validationInfo;
	
	private FeaturesInfo featuresInfo;
	

	

	@XmlElement(required=true)
	public ValidationInfo getValidationInfo() {
		return validationInfo;
	}

	public void setValidationInfo(ValidationInfo validationInfo) {
		this.validationInfo = validationInfo;
	}

	@XmlElement(required=false)
	public IdentificationInfo getIdentificationInfo() {
		return identificationInfo;
	}

	public void setIdentificationInfo(IdentificationInfo identificationInfo) {
		this.identificationInfo = identificationInfo;
	}

	@XmlElement(required=false)
	public FeaturesInfo getFeaturesInfo() {
		return featuresInfo;
	}

	public void setFeaturesInfo(FeaturesInfo featuresInfo) {
		this.featuresInfo = featuresInfo;
	}
	
	
	

}

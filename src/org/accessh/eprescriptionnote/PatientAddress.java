package org.accessh.eprescriptionnote;

public class PatientAddress {

	private String patientAddressType;
	private String premisesIdentifier;
	private String subLocality1;
	private String locality;
	private int landRegionCode;
	private int district;
	private int subDistrict;
	private int village;
	private int town;
	private int state;
	private int pin;
	private String nameOfLandRegionInEnglish;
	private String patientEmailAddress;
	private String patientMobileNumber;
	
	public String getPatientAddressType() {
		return patientAddressType;
	}
	public void setPatientAddressType(String patientAddressType) {
		this.patientAddressType = patientAddressType;
	}
	public String getPremisesIdentifier() {
		return premisesIdentifier;
	}
	public void setPremisesIdentifier(String premisesIdentifier) {
		this.premisesIdentifier = premisesIdentifier;
	}
	public String getSubLocality1() {
		return subLocality1;
	}
	public void setSubLocality1(String subLocality1) {
		this.subLocality1 = subLocality1;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	
	public int getLandRegionCode() {
		return landRegionCode;
	}
	public void setLandRegionCode(int landRegionCode) {
		this.landRegionCode = landRegionCode;
	}
	public int getDistrict() {
		return district;
	}
	public void setDistrict(int district) {
		this.district = district;
	}
	public int getSubDistrict() {
		return subDistrict;
	}
	public void setSubDistrict(int subDistrict) {
		this.subDistrict = subDistrict;
	}
	public int getVillage() {
		return village;
	}
	public void setVillage(int village) {
		this.village = village;
	}
	public int getTown() {
		return town;
	}
	public void setTown(int town) {
		this.town = town;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getNameOfLandRegionInEnglish() {
		return nameOfLandRegionInEnglish;
	}
	public void setNameOfLandRegionInEnglish(String nameOfLandRegionInEnglish) {
		this.nameOfLandRegionInEnglish = nameOfLandRegionInEnglish;
	}
	public String getPatientEmailAddress() {
		return patientEmailAddress;
	}
	public void setPatientEmailAddress(String patientEmailAddress) {
		this.patientEmailAddress = patientEmailAddress;
	}
	public String getPatientMobileNumber() {
		return patientMobileNumber;
	}
	public void setPatientMobileNumber(String patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}

	
	
}

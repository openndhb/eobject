package org.accessh.eprescriptionnote;

import java.util.Date;

public class PrescriptionHTTPHeader {
	
	private int uniqueHealthIdentificationNumber;
	private String facilityGlobalUniqueIdentifierPharmacyID;
	private String facilityGlobalUniqueIdentifierOrderingFacilityID;
	private String orderVerifyingCareProviderID;
    private int clinicalDocumentTypeCode;
	private String prescriptionID;
	private Date orderDate;
	private Date orderTime;
	private String encounterID;
	private String episodeID;
	
	public int getUniqueHealthIdentificationNumber() {
		return uniqueHealthIdentificationNumber;
	}
	public void setUniqueHealthIdentificationNumber(int uniqueHealthIdentificationNumber) {
		this.uniqueHealthIdentificationNumber = uniqueHealthIdentificationNumber;
	}
	public String getFacilityGlobalUniqueIdentifierPharmacyID() {
		return facilityGlobalUniqueIdentifierPharmacyID;
	}
	public void setFacilityGlobalUniqueIdentifierPharmacyID(String facilityGlobalUniqueIdentifierPharmacyID) {
		this.facilityGlobalUniqueIdentifierPharmacyID = facilityGlobalUniqueIdentifierPharmacyID;
	}
	public String getFacilityGlobalUniqueIdentifierOrderingFacilityID() {
		return facilityGlobalUniqueIdentifierOrderingFacilityID;
	}
	public void setFacilityGlobalUniqueIdentifierOrderingFacilityID(
			String facilityGlobalUniqueIdentifierOrderingFacilityID) {
		this.facilityGlobalUniqueIdentifierOrderingFacilityID = facilityGlobalUniqueIdentifierOrderingFacilityID;
	}
	public String getOrderVerifyingCareProviderID() {
		return orderVerifyingCareProviderID;
	}
	public void setOrderVerifyingCareProviderID(String orderVerifyingCareProviderID) {
		this.orderVerifyingCareProviderID = orderVerifyingCareProviderID;
	}
	public int getClinicalDocumentTypeCode() {
		return clinicalDocumentTypeCode;
	}
	public void setClinicalDocumentTypeCode(int clinicalDocumentTypeCode) {
		this.clinicalDocumentTypeCode = clinicalDocumentTypeCode;
	}
	public String getPrescriptionID() {
		return prescriptionID;
	}
	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getEncounterID() {
		return encounterID;
	}
	public void setEncounterID(String encounterID) {
		this.encounterID = encounterID;
	}
	public String getEpisodeID() {
		return episodeID;
	}
	public void setEpisodeID(String episodeID) {
		this.episodeID = episodeID;
	}
	
	

}

package org.accessh.eprescriptionnote;

import java.util.Date;

public class PrescriptionInformation {
	private String prescriptionID;
	private Date orderDate;
	private String uniqueIndividualHealthCareProviderNumber;
	private String healthCareProviderMobileNumber;
	private int uniqueHealthIdentificationNumber;
	
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
	public String getUniqueIndividualHealthCareProviderNumber() {
		return uniqueIndividualHealthCareProviderNumber;
	}
	public void setUniqueIndividualHealthCareProviderNumber(String uniqueIndividualHealthCareProviderNumber) {
		this.uniqueIndividualHealthCareProviderNumber = uniqueIndividualHealthCareProviderNumber;
	}
	public String getHealthCareProviderMobileNumber() {
		return healthCareProviderMobileNumber;
	}
	public void setHealthCareProviderMobileNumber(String healthCareProviderMobileNumber) {
		this.healthCareProviderMobileNumber = healthCareProviderMobileNumber;
	}
	public int getUniqueHealthIdentificationNumber() {
		return uniqueHealthIdentificationNumber;
	}
	public void setUniqueHealthIdentificationNumber(int uniqueHealthIdentificationNumber) {
		this.uniqueHealthIdentificationNumber = uniqueHealthIdentificationNumber;
	}

	
}

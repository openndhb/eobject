package org.accessh.eprescriptionnote;

public class ActiveConditions {

	private String healthConditionCodeDiagnosis;
	private int comorbidityIndicator;
	private String comorbidityHealthConditionCode;
	private int pregnancyIndicator;
	
	public String getHealthConditionCodeDiagnosis() {
		return healthConditionCodeDiagnosis;
	}
	public void setHealthConditionCodeDiagnosis(String healthConditionCodeDiagnosis) {
		this.healthConditionCodeDiagnosis = healthConditionCodeDiagnosis;
	}
	public int getComorbidityIndicator() {
		return comorbidityIndicator;
	}
	public void setComorbidityIndicator(int comorbidityIndicator) {
		this.comorbidityIndicator = comorbidityIndicator;
	}
	public String getComorbidityHealthConditionCode() {
		return comorbidityHealthConditionCode;
	}
	public void setComorbidityHealthConditionCode(String comorbidityHealthConditionCode) {
		this.comorbidityHealthConditionCode = comorbidityHealthConditionCode;
	}
	public int getPregnancyIndicator() {
		return pregnancyIndicator;
	}
	public void setPregnancyIndicator(int pregnancyIndicator) {
		this.pregnancyIndicator = pregnancyIndicator;
	}

	
}

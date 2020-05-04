package org.accessh.eprescriptionnote;

public class Eprescriptionnote {
	
	private long id;
	private Meta meta;
	private PrescriptionInformation prescriptionInformation;
    private	PatientInformation patientInformation;
	private PatientAddress patientAddress;
	private PatientDrugAllergies PatientDrugAllergies;
	private ActiveConditions activeConditions;
	private ActiveLabOrders activeLabOrders;
	private RxDetails rxDetails;
	private ImmunizationOrder immunizationOrder;
	private AuthorDetail authorDetail;
	public PrescriptionInformation getPrescriptionInformation() {
		return prescriptionInformation;
	}
	public void setPrescriptionInformation(PrescriptionInformation prescriptionInformation) {
		this.prescriptionInformation = prescriptionInformation;
	}
	public PatientInformation getPatientInformation() {
		return patientInformation;
	}
	public void setPatientInformation(PatientInformation patientInformation) {
		this.patientInformation = patientInformation;
	}
	public PatientAddress getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(PatientAddress patientAddress) {
		this.patientAddress = patientAddress;
	}
	public PatientDrugAllergies getPatientDrugAllergies() {
		return PatientDrugAllergies;
	}
	public void setPatientDrugAllergies(PatientDrugAllergies patientDrugAllergies) {
		PatientDrugAllergies = patientDrugAllergies;
	}
	public ActiveConditions getActiveConditions() {
		return activeConditions;
	}
	public void setActiveConditions(ActiveConditions activeConditions) {
		this.activeConditions = activeConditions;
	}
	public ActiveLabOrders getActiveLabOrders() {
		return activeLabOrders;
	}
	public void setActiveLabOrders(ActiveLabOrders activeLabOrders) {
		this.activeLabOrders = activeLabOrders;
	}
	public RxDetails getRxDetails() {
		return rxDetails;
	}
	public void setRxDetails(RxDetails rxDetails) {
		this.rxDetails = rxDetails;
	}
	public ImmunizationOrder getImmunizationOrder() {
		return immunizationOrder;
	}
	public void setImmunizationOrder(ImmunizationOrder immunizationOrder) {
		this.immunizationOrder = immunizationOrder;
	}
	public AuthorDetail getAuthorDetail() {
		return authorDetail;
	}
	public void setAuthorDetail(AuthorDetail authorDetail) {
		this.authorDetail = authorDetail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	
	

}

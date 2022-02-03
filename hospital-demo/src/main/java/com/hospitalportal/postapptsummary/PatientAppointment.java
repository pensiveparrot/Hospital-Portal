package com.hospitalportal.postapptsummary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hospitalportal.base.auth.Patient;



@Entity
@Table(name = "patient_appointment")
public class PatientAppointment {

	public PatientAppointment(String patientAppointmentId, String apptName, String apptType, String apptDate,
			String summary, String confirmed) {
		super();
		this.patientAppointmentId = patientAppointmentId;
		this.apptName = apptName;
		this.apptType = apptType;
		this.apptDate = apptDate;
		this.summary = summary;
		this.confirmed = confirmed;
	}

	public PatientAppointment() {
		super();
	}
	
	@Id
	@Column(name="patientAppointmentId")
	private String patientAppointmentId;
	@Column(name = "appt_name")
	private String apptName;
	
	@Column(name = "appt_type")
	private String apptType;

	@Column(name = "appt_date")
	private String apptDate;
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "confirmed")
	private String confirmed;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patientId")
	private Patient patient;
	public String getPatientAppointmentId() {
		return patientAppointmentId;
	}

	public void setPatientAppointmentId(String patientAppointmentId) {
		this.patientAppointmentId = patientAppointmentId;
	}

	public String getApptName() {
		return apptName;
	}

	public void setApptName(String apptName) {
		this.apptName = apptName;
	}

	public String getApptType() {
		return apptType;
	}

	public void setApptType(String apptType) {
		this.apptType = apptType;
	}

	public String getApptDate() {
		return apptDate;
	}

	public void setApptDate(String apptDate) {
		this.apptDate = apptDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

//	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "employeeId")
//	private Employee employee;






















































































	  
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "employee_details_id", referencedColumnName = "id")
//    private EmployeeDetails employeeDetailsId;
//	@JsonIgnore
//    @OneToMany(
//            mappedBy = "mPatient",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//        )
//	private List<Patient> patientId = new ArrayList<>();








//
//	public List<Patient> getPatientId() {
//		return patientId;
//	}
//
//
//	public void setPatientId(List<Patient> patientId) {
//		this.patientId = patientId;
//	}


}

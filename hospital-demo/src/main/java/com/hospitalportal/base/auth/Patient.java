package com.hospitalportal.base.auth;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hospitalportal.postapptsummary.Appointments;

@Entity
@Table(name = "patient_login")
public class Patient {






	public Patient(String patientId, String password) {
		super();
		this.patientId = patientId;
		this.password = password;
	}



	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "patient_details_id", referencedColumnName = "id")
//	private PatientDetails patientDetailsId;

	@Id
	@Column(name="patientId")
	private String patientId;
	@Column(name = "password")
	private String password;

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee mPatient;

    @JsonIgnore
    @OneToMany(
            mappedBy = "mAppointments",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
    private List<Appointments> appointmentsId= new ArrayList<>();
    
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", password=" + password + "]";
	}

	public Employee getEmployee() {
		return mPatient;
	}

	public void setEmployee(Employee mPatient) {
		this.mPatient = mPatient;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Employee getmPatient() {
		return mPatient;
	}

	public void setmPatient(Employee mPatient) {
		this.mPatient = mPatient;
	}



	public List<Appointments> getPatientAppointmentsId() {
		return appointmentsId;
	}



	public void setPatientAppointmentsId(List<Appointments> patientAppointmentsId) {
		this.appointmentsId = patientAppointmentsId;
	}
	
}
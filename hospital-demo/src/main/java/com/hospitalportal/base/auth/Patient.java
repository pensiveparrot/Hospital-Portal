package com.hospitalportal.base.auth;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient_login")
public class Patient {



	public Patient(String patientId, String password, Employee mPatient) {
		super();
		this.patientId = patientId;
		this.password = password;
		this.mPatient = mPatient;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee mPatient;

    
    
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
}

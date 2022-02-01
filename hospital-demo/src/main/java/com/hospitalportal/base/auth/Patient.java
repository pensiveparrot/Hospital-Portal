package com.hospitalportal.base.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "patient_login")
public class Patient {
	
	

public Patient(String login, int patientId, String password) {
		super();
		this.login = login;
		this.patientId = patientId;
		this.password = password;
	}

public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

private String login;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="password")
	private String password;
}

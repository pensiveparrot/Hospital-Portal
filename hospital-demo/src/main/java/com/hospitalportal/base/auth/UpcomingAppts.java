package com.hospitalportal.base.auth;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime; 


@Entity
@Table(name = "upcoming_apts")

public class UpcomingAppts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appt_id")
	private int apptID;
	@Column(name="appt_name")
	private String apptName;
	@Column(name="appt_type")
	private String apptType;
	@Column (name="patient_id")
	private int patientID;
	@Column(name="appt_date")
	private LocalDate apptDate;
	@Column(name="summary")
	private String summary;
	@Column (name="confirmed")
	private String confirmed;
	public int getApptID() {
		return apptID;
	}
	public void setApptID(int apptID) {
		this.apptID = apptID;
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
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public LocalDate getApptDate() {
		return apptDate;
	}
	public void setApptDate(LocalDate apptDate) {
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
	

}

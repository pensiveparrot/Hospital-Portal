package com.hospitalportal.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name ="patientportal")
public class PatientPortal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "appointmenttype")
	private String appointmentType;
	
	@Column(name = "appointmenttime")
	private Date appointmentTime;
	
	@Column(name = "summary")
	private String summary;

	public PatientPortal(String appointmentType, Date appointmentTime, String summary) {
		super();
		this.appointmentType = appointmentType;
		this.appointmentTime = appointmentTime;
		this.summary = summary;
	}

	public PatientPortal() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	public Date getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
}

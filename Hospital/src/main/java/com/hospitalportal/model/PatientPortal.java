package com.hospitalportal.model;

import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name ="patientportal")
public class PatientPortal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name = "appointmenttype")
	private String appointmentType;
	
	@Column(name = "appointmenttime")
	private Date appointmentTime;
	
	@Column(name = "summary")
	private String summary;

	public PatientPortal(String first_name, String last_name, String appointmentType, Date appointmentTime,
			String summary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

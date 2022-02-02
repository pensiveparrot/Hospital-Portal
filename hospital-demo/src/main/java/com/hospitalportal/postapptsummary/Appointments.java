package com.hospitalportal.postapptsummary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hospitalportal.base.auth.Patient;

@Entity
@Table(name = "appointments") 
public class Appointments {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appt_id")
	private int apptId;
	
	@Column(name = "appt_name")
	private String apptName;
	
	@Column(name = "appt_type")
	private String apptType;
	
	@Column(name = "patient_id")
	private int patientId;
	
	@Column(name = "appt_date")
	private DateTimeFormat apptDate;
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "confirmed")
	private String confirmed;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient mAppointments;


	public Appointments(int apptId, String apptName, String apptType, int patientId, DateTimeFormat apptDate,
			String summary, String confirmed, Patient mPatientAppointment) {
		super();
		this.apptId = apptId;
		this.apptName = apptName;
		this.apptType = apptType;
		this.patientId = patientId;
		this.apptDate = apptDate;
		this.summary = summary;
		this.confirmed = confirmed;
		this.mAppointments = mPatientAppointment;
	}
	

	public Appointments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient getmPatientAppointment() {
		return mAppointments;
	}


	public void setmPatientAppointment(Patient mPatientAppointment) {
		this.mAppointments = mPatientAppointment;
	}


	public int getApptId() {
		return apptId;
	}

	public void setApptId(int apptId) {
		this.apptId = apptId;
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

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public DateTimeFormat getApptDate() {
		return apptDate;
	}

	public void setApptDate(DateTimeFormat apptDate) {
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

/*
 CREATE TABLE `upcoming_apts` (
  `appt_id` int NOT NULL AUTO_INCREMENT,
  `appt_name` varchar(45) NOT NULL,
  `appt_type` varchar(45) NOT NULL,
  `patient_id` int NOT NULL,
  `appt_date` datetime DEFAULT NULL,
  `summary` varchar(255) DEFAULT NULL,
  `confirmed` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`appt_id`),
  KEY `patientid_idx` (`patient_id`),
  CONSTRAINT `patient_id` FOREIGN KEY (`patient_id`) REFERENCES `patient_details` (`patient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
*/

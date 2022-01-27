package com.hospitalportal.base.auth;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee_login")
public class Employee {


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public EmployeeDetails getPassword() {
		return password;
	}

	public void setPassword(EmployeeDetails password) {
		this.password = password;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "patient_id", nullable = false)
		private Patient patientId;
	@JoinColumn(name = "password")
	private EmployeeDetails password;

	@Id
	@JoinColumn(name = "employee_details_id")
	private EmployeeDetails employeeDetails;
}

package com.hospitalportal.base.auth;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="employee_login")
public class Employee {
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

	public Patient getId() {
		return id;
	}

	public void setId(Patient id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "patient_id")
	private Patient id;
	
	@JoinColumn(name="password")
	private EmployeeDetails password;
	
	@Id
	@JoinColumn(name="employee_details_id")
	private EmployeeDetails employeeDetails;
}

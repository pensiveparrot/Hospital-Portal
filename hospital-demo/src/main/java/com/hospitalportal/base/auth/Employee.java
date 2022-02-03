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

@Entity
@Table(name = "employee_login")
public class Employee {

	public Employee(String employeeId, String password) {
		super();
		this.employeeId = employeeId;
		this.password = password;
	}

	public Admin getmAdmin() {
		return mAdmin;
	}

	public void setmAdmin(Admin mAdmin) {
		this.mAdmin = mAdmin;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + "]";
	}

	@Id
	@Column(name = "employeeId")
	private String employeeId;

	@Column(name = "password")
	private String password;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "employee_details_id", referencedColumnName = "id")
//    private EmployeeDetails employeeDetailsId;
	@JsonIgnore
	@OneToMany(mappedBy = "mPatient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Patient> patientId = new ArrayList<>();

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	private Admin mAdmin;

	public Admin getAdmin_login() {
		return mAdmin;
	}

	public void setAdmin_login(Admin mAdmin) {
		this.mAdmin = mAdmin;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Patient> getPatientId() {
		return patientId;
	}

	public void setPatientId(List<Patient> patientId) {
		this.patientId = patientId;
	}

}
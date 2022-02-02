package com.hospitalportal.base.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {




	public EmployeeDetails(String employeedetailsid, String firstName, String lastName, String email, String phone,
			Employee employee) {
		super();
		this.employeeDetailsId = employeedetailsid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.employee = employee;
	}

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name=("employeedetailsid"))
	private String employeeDetailsId;

	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employeeId")
	private Employee employee;
    
    
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getId() {
		return employeeDetailsId;
	}

	public void setId(String employeedetailsid) {
		this.employeeDetailsId = employeedetailsid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

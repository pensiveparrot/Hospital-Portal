package com.hospitalportal.base.auth;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_login")
public class Employee {
//password varchar needs length constraint of 128 
	@Id
	@Column(name = "password",unique=true,columnDefinition="VARCHAR(128)")
	private String password;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_details_id")
    private Integer EmployeeDetailsId;
}
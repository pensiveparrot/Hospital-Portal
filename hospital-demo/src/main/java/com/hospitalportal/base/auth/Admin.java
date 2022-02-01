package com.hospitalportal.base.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_login")
public class Admin {
	public Admin(int id, int employeeId, String password, String login) {
		super();
		Id = id;
		this.employeeId = employeeId;
		this.password = password;
		this.login = login;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private int Id;

	@Column(name = "employee_id", insertable = false, updatable = false)
	private int employeeId;
	@Column(name = "password")
	private String password;




	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private String login;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}

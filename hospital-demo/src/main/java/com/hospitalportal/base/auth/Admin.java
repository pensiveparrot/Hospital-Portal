package com.hospitalportal.base.auth;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Table(name="admin_login")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne
	@JoinColumn(name="employee_id",nullable=false)
	private Employee id;
	@Column(name="password")
	private String password;
	
}

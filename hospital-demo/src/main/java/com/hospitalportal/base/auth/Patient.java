package com.hospitalportal.base.auth;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient_login")
public class Patient {
// varchar needs length 30 constraint
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String patientId;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "password")
    private String password;
}
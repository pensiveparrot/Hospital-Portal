package com.hospitalportal.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalportal.base.auth.Patient;
import com.hospitalportal.base.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	public Patient login(int id, String password) {
		return (patientRepository.findByLoginAndPassword(Integer.toString(id), password).orElse(null));

	}
}

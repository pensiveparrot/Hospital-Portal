package com.hospitalportal.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	Patient findById(String Id);
}

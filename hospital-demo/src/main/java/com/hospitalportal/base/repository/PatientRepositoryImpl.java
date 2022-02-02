package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.auth.Patient;
@Repository
public interface PatientRepositoryImpl extends JpaRepository<Patient, String> {
	Patient findByPatientId(String patientId);
	//Optional<Patient> findByLoginAndPassword(String id, String password);

	//Optional<Patient> findByPatientIdAndPassword(String patientId, String password);
}
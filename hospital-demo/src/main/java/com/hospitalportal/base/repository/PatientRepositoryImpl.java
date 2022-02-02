package com.hospitalportal.base.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.base.auth.Patient;

@Repository
public interface PatientRepositoryImpl extends JpaRepository<Patient, String> {

	Patient findByPatientId(String patientId);

}
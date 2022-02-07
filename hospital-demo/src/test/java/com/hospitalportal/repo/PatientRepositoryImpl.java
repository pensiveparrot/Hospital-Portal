package com.hospitalportal.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.model.Patient;
@Repository
public interface PatientRepositoryImpl extends JpaRepository<Patient, Long> {

	Patient findByPatientId(Long patientId);

}
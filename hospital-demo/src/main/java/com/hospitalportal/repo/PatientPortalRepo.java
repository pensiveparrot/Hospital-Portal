package com.hospitalportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.model.Patient;
import com.hospitalportal.model.PatientPortal;

@Repository
public interface PatientPortalRepo extends JpaRepository<PatientPortal, Long> {
	
}

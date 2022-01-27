package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	Patient findById(String Id);

	Optional<Patient> findByLoginAndPassword(String id, String password);
}
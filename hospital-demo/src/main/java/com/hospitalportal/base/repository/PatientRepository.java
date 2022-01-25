package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	Optional<Patient> findByLoginAndPassword(String username, String password);
}

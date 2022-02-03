package com.hospitalportal.postapptsummary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.base.auth.PatientAppointment;

@Repository
public interface PatientAppointmentRepositoryImpl extends JpaRepository<PatientAppointment, String>{
	List<PatientAppointment> findAll();
	PatientAppointment findByPatientAppointmentId(String patientAppointmentId);
}

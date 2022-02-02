//package com.hospitalportal.base.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hospitalportal.base.auth.Patient;
//import com.hospitalportal.base.repository.PatientRepositoryImpl;
//
//@RestController
//@RequestMapping("/patient")
//@CrossOrigin
//public class PatientLoginController {
//	@Autowired
//	private PatientRepositoryImpl patientRepo;
//	
//	@PostMapping("/login")
//	public ResponseEntity<Patient> loginPatient(@RequestBody Patient patientData){
//		System.out.println(patientData);
//		Patient patient=patientRepo.findByPatientId(patientData.getPatientId());
//	    //ResponseEntity<?> responseEntity = new ResponseEntity<>(ResponseObject, HttpStatus.OK);
//		if(patient.getPassword().equals(patientData.getPassword()))
//			return ResponseEntity.ok(patient);
//		return (ResponseEntity<Patient>)ResponseEntity.status(500);
//	}
//	
//}

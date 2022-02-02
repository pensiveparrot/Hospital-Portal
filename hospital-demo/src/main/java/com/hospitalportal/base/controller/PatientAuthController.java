package com.hospitalportal.base.controller;
//Authentication authentication = authenticationManager

//.authenticate(new UsernamePasswordAuthenticationToken(patientData.getPatientId(), patientData.getPassword()));
////

//public ResponseEntity<Patient> loginPatient(@RequestBody Patient patientData){
//System.out.println(patientData);
//Patient patient=patientRepo.findByPatientId(patientData.getPatientId());
////ResponseEntity<?> responseEntity = new ResponseEntity<>(ResponseObject, HttpStatus.OK);
//if(patient.getPassword().equals(patientData.getPassword()))
//return ResponseEntity.ok(patient);
//return (ResponseEntity<Patient>)ResponseEntity.status(500);
//SecurityContextHolder.getContext().setAuthentication(authentication);
////
//Patient patient = (Patient) authentication.getPrincipal();
////
//ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(patient);
////
//List<String> roles = patientData.getAuthorities().stream()
//.map(item -> item.getAuthority())
//.collect(Collectors.toList());
////		if(patient!=null && patientData.getPatientId().equalsIgnoreCase(patient.getPatientId()) && encoder.matches(patientData.getPassword(), patient.getPassword())){
//
//}
//else
//return new ResponseEntity<Patient>(patient, HttpStatus.BAD_REQUEST);
//		if(patient==null)
//
//
//else
//return new ResponseEntity<Patient>(patient, HttpStatus.OK);

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.base.auth.Patient;
import com.hospitalportal.base.repository.PatientRepositoryImpl;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class PatientAuthController {

	@Autowired
	PatientRepositoryImpl patientRepo;

	
	@PostMapping("/patient/login")
	public ResponseEntity<Patient> loginPatient(@Valid @RequestBody Patient patientData) {
		System.out.println(patientData);

		Patient patient = patientRepo.findByPatientId(patientData.getPatientId());
		if (patient.getPassword().equals(patientData.getPassword()))
			return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		return new ResponseEntity<Patient>(patient, HttpStatus.BAD_REQUEST);

	}

}

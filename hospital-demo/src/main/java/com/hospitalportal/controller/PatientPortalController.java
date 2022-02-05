package com.hospitalportal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.repo.PatientPortalRepo;
import com.hospitalportal.exception.ResourceNotFoundException;
import com.hospitalportal.model.Patient;
import com.hospitalportal.model.PatientPortal;


@CrossOrigin
@RestController
@RequestMapping(path = "/api/patient")
public class PatientPortalController {
	@Autowired
	private PatientPortalRepo patientPortalRepo;
	
//	@GetMapping("/patientportal")
//	public List<PatientPortal> getpatientPortal(){
//		return patientPortalRepo.findAll();
//	}
//	
	@PostMapping("/patientportal")
	public PatientPortal createPatientPortal(@RequestBody PatientPortal patientportal) {
		return patientPortalRepo.save(patientportal);
	}
	
//	@GetMapping("/patientportal")
//	public Long getpatientPortal(@RequestBody Long id) {
//		PatientPortal patientportal = patientPortalRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
//	
//		if(patientportal==null)
//			return -1L;
//		System.out.println(id);
//		return id;
//	}
	
//	@PostMapping("/patient/login")
//	public ResponseEntity<Patient> loginPatient(@Valid @RequestBody Patient patientData) {
//		System.out.println(patientData);
//
//		Patient patient = patientRepo.findByPatientId(patientData.getPatientId());
//		if (patient.getPassword().equals(patientData.getPassword()))
//			return new ResponseEntity<Patient>(patient, HttpStatus.OK);
//		return new ResponseEntity<Patient>(patient, HttpStatus.BAD_REQUEST);
//
//	}
//	
	@GetMapping("/patientportal/{id}")
	public ResponseEntity<PatientPortal> getpatientPortal(@PathVariable Long id){
		PatientPortal patientportal = patientPortalRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		if(patientportal.getPatientPortalId()>0 && patientportal!=null)
			return new ResponseEntity<PatientPortal>(patientportal, HttpStatus.OK);
		return new ResponseEntity<PatientPortal>(patientportal, HttpStatus.BAD_REQUEST);
	}
//	@GetMapping("/patientportal/{id}")
//	public @ResponseBody ResponseEntity<Long>
//	  getById(@PathVariable Long id) {
//		PatientPortal patientportal = patientPortalRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
//		if(patientportal!=null)
//	    return new ResponseEntity<Long>(id, HttpStatus.OK);
//		return new ResponseEntity<Long>(-1L, HttpStatus.OK);
//	}
//
	
//	@GetMapping("/accounts/{id}")
//	public ResponseEntity<accountMain> getaccountById(@PathVariable Long id) {
//		accountMain account = accountRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("account does not exist with id :" + id));
//		return ResponseEntity.ok(account);
//	}
//	
	@PostMapping("/patientportal/{id}")
	public ResponseEntity<PatientPortal> updatepatientPortal(@PathVariable Long id, @RequestBody PatientPortal portalDetails){
		PatientPortal patientportal = patientPortalRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		patientportal.setAppointmentTime(portalDetails.getAppointmentTime());
    patientportal.setFirst_name(portalDetails.getFirst_name());
		patientportal.setLast_name(portalDetails.getLast_name());
		patientportal.setAppointmentType(portalDetails.getAppointmentType());
		patientportal.setSummary(portalDetails.getSummary());
		
		PatientPortal updatePortal = patientPortalRepo.save(patientportal);
		return ResponseEntity.ok(updatePortal);
	}
	
	@DeleteMapping("/patientportal/{id}")
	public ResponseEntity<Map<String,Boolean>> deletePortal(@PathVariable Long id){
		PatientPortal patientportal = patientPortalRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		patientPortalRepo.delete(patientportal);
		Map<String,Boolean> response = new HashMap<>();
		response.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}

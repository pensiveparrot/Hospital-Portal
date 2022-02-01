package com.hospitalportal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.hospitalportal.repo.PatientPortalRepo;
import com.hospitalportal.exception.ResourceNotFoundException;
import com.hospitalportal.model.PatientPortal;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "/api/v1/")
public class PatientPortalController {
	@Autowired
	private PatientPortalRepo patientPortalRepo;
	
	@GetMapping("/patientportal")
	public List<PatientPortal> getpatientPortal(){
		return patientPortalRepo.findAll();
	}
	
	@PostMapping("/patientportal")
	public PatientPortal createPatientPortal(@RequestBody PatientPortal patientportal) {
		return patientPortalRepo.save(patientportal);
	}
	
	@GetMapping("/patientportal/{id}")
	public ResponseEntity<PatientPortal> getpatientPortal(@PathVariable Long id){
		PatientPortal patientportal = patientPortalRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		return ResponseEntity.ok(patientportal);
	}
	
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

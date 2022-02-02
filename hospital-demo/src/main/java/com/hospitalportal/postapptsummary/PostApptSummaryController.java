package com.hospitalportal.postapptsummary;

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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/postApptSummary")
public class PostApptSummaryController {
	
	@Autowired
	private PostApptSummaryRepository PASRepo; 
	
	@GetMapping("/appointments")
	public List<Appointments> getAllAppointments() {
		return PASRepo.findAll();
	}
	
	@PostMapping("/appointments")
	public Appointments createAppointment(@RequestBody Appointments pas) {
		return PASRepo.save(pas);
	}
	
	@GetMapping("/appointments/{id}") // QUESTION: multiple get mappings, use of the {id}
	public ResponseEntity<Appointments> getAppointmentById(@PathVariable int id, @RequestBody Appointments apptDetails) {
		Appointments appt = PASRepo.findById(id)
				.orElseThrow(() ->new ResourceNotFoundException("Appointment Id Not found: "+ id));
		
		appt.setApptDate(apptDetails.getApptDate());
		appt.setApptName(apptDetails.getApptName());
		appt.setApptType(apptDetails.getApptType());
		appt.setConfirmed(apptDetails.getConfirmed());
		appt.setPatientId(apptDetails.getPatientId()); // QUESTION: we don't expect any user to know this. where is the ID coming from
		appt.setSummary(apptDetails.getSummary());
		
		Appointments updatedAppt = PASRepo.save(appt);
		return ResponseEntity.ok(updatedAppt);
	}
	
	@PutMapping("/appointments/{id}")
	public ResponseEntity<Appointments> updateAppointment(@PathVariable int id, @RequestBody Appointments apptDetails) {
		Appointments appt = PASRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Appointment Id not found:"+ id));
		
		appt.setApptDate(apptDetails.getApptDate());
		appt.setApptName(apptDetails.getApptName());
		appt.setApptType(apptDetails.getApptType());
		appt.setConfirmed(apptDetails.getConfirmed());
		appt.setPatientId(apptDetails.getPatientId()); // QUESTION: Same as previous question
		appt.setSummary(apptDetails.getSummary());
		
		Appointments updatedAppt = PASRepo.save(appt);
		return ResponseEntity.ok(updatedAppt);
	}
	
	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int id) {
		Appointments appt = PASRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Appointment Id not found:"+ id));

		PASRepo.delete(appt);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
	
}

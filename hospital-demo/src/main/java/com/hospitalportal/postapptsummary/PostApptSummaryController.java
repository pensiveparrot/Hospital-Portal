package com.hospitalportal.postapptsummary;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.hospitalportal.base.auth.PatientAppointment;
//import com/hospitalportal/postapptsummary/PatientAppointmentRepository.java
import com.hospitalportal.postapptsummary.PatientAppointmentRepositoryImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/patient_appointment")
public class PostApptSummaryController {

	@Autowired
	private PatientAppointmentRepositoryImpl PASRepo;

	@GetMapping("/get")
	public List<PatientAppointment> getAllAppointments() {
		return PASRepo.findAll();
	}

	@PostMapping("/submit")
	public PatientAppointment createAppointment(@RequestBody PatientAppointment pas) {
		return PASRepo.save(pas);
	}

	@GetMapping("/{id}") // QUESTION: multiple get mappings, use of the {id}
	public ResponseEntity<PatientAppointment> getApptId(@PathVariable String id,
			@RequestBody PatientAppointment apptDetails) {
		PatientAppointment pAppt = PASRepo.findByPatientAppointmentId(id);
		if (pAppt.getPatientAppointmentId().equalsIgnoreCase(apptDetails.getPatientAppointmentId()))
			return new ResponseEntity<PatientAppointment>(pAppt, HttpStatus.OK);
		return new ResponseEntity<PatientAppointment>(pAppt, HttpStatus.BAD_REQUEST);
	}

	@PostMapping("/appointments/{id}")
	public ResponseEntity<PatientAppointment> updateAppointment(@PathVariable String id,
			@RequestBody PatientAppointment apptDetails) {
		PatientAppointment pAppt = PASRepo.findByPatientAppointmentId(id);

		if (apptDetails.getPatientAppointmentId().equalsIgnoreCase(pAppt.getPatientAppointmentId())) {
			if (apptDetails.getApptDate() != null)
				pAppt.setApptDate(apptDetails.getApptDate());
			if (apptDetails.getApptName() != null)
				pAppt.setApptName(apptDetails.getApptName());
			if (apptDetails.getApptType() != null)
				pAppt.setApptType(apptDetails.getApptType());
			if (apptDetails.getConfirmed() != null)
				pAppt.setConfirmed(apptDetails.getConfirmed());
			if (apptDetails.getPatientAppointmentId() != null)
				pAppt.setPatientAppointmentId(apptDetails.getPatientAppointmentId());

		}

		PatientAppointment updatedAppt = PASRepo.save(pAppt);
		return ResponseEntity.ok(updatedAppt);
	}

	@DeleteMapping("/appointments/{id}")
	public ResponseEntity<List<String>> deleteEmployee(@PathVariable String id,
			@RequestBody PatientAppointment apptDetails) {
		PatientAppointment pAppt = PASRepo.findByPatientAppointmentId(id);
		List<String> response = new ArrayList<>();
		if (apptDetails.getPatientAppointmentId().equalsIgnoreCase(pAppt.getPatientAppointmentId())) {
			if (apptDetails.getApptDate() != null)
				response.add(pAppt.getApptDate());
			if (apptDetails.getApptName() != null)
				response.add(pAppt.getApptName());
			if (apptDetails.getApptType() != null)
				response.add(pAppt.getApptType());
			if (apptDetails.getConfirmed() != null)
				response.add(pAppt.getConfirmed());
			if (apptDetails.getPatientAppointmentId() != null)
				response.add(pAppt.getPatientAppointmentId());

			PASRepo.delete(pAppt);

			for (String s : response) {
				System.out.println(s);
			}
			return new ResponseEntity<List<String>>(HttpStatus.OK);

		} else {
			for (String s : response) {
				System.out.println(s);
			}
			return new ResponseEntity<List<String>>(HttpStatus.BAD_REQUEST);
		}

	}
}

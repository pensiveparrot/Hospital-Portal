package com.hospitalportal.base.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.auth.UpcomingAppts;
import com.hospitalportal.base.exception.ResourceNotFoundException;
import com.hospitalportal.base.repository.AdminRepository;
import com.hospitalportal.base.repository.AppointmentRepository;

@RestController
@CrossOrigin(origins="http://localhost:8081")
public class AppointmentController {
@Autowired
AppointmentRepository apptRepo;
@GetMapping("/appointment/{id}")
public ResponseEntity<UpcomingAppts>getApptByID(@PathVariable(value = "id")int id)
throws ResourceNotFoundException
		{
	UpcomingAppts admin= new apptRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Appointment not found for this id :: " + employeeId));
	return ResponseEntity.ok().body(admin);
		}
@PostMapping("/appointment")
public UpcomingAppts createEmployee(@Valid @RequestBody UpcomingAppts admin) {
    return apptRepo.save(admin);
}
public ResponseEntity<UpcomingAppts> updateAdmin(@PathVariable(value = "id") int adminID,
        @Valid @RequestBody Admin adminDetails) throws ResourceNotFoundException {
       UpcomingAppts admin = apptRepo.findByID(adminID);
     admin.setApptID(admin.getApptID());
      admin.setPatientID(admin.getPatientID());
      admin.setApptDate(admin.getApptDate());
      admin.setApptName(admin.getApptName());
      admin.setApptType(admin.getApptType());
      admin.setConfirmed(admin.getConfirmed());
      admin.setSummary(admin.getSummary());
      
       final UpcomingAppts updatedAdmin = apptRepo.save(admin);
       return ResponseEntity.ok(updatedAdmin);
   }

   @DeleteMapping("/appointment/{id}")
   public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int employeeId)
        throws ResourceNotFoundException {
       UpcomingAppts admin = apptRepo.findById(employeeId)
      .orElseThrow(() -> new ResourceNotFoundException());
apptRepo.delete(admin);
       Map<String, Boolean> response = new HashMap<>();
       response.put("deleted", Boolean.TRUE);
       return response;
   }
}

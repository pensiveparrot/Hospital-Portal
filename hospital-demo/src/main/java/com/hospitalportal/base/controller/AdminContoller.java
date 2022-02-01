package com.hospitalportal.base.controller;
import java.security.Principal;
import java.sql.SQLException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.exception.ResourceNotFoundException;
import com.hospitalportal.base.repository.AdminRepository;
@RestController
@CrossOrigin(origins="http://localhost:8081")
public class AdminContoller {
@Autowired
AdminRepository adminRepo;
@GetMapping("/admin")
List<Admin>getAllAdmin()
{
	return adminRepo.findAll();
}
@GetMapping("/admin/{id}")
public ResponseEntity<Admin>getAdminByID(@PathVariable(value = "id")int id)
throws ResourceNotFoundException
		{
	Admin admin= new adminRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
	return ResponseEntity.ok().body(admin);
		}
@PostMapping("/admin")
public Admin createEmployee(@Valid @RequestBody Admin admin) {
    return adminRepo.save(admin);
}
public ResponseEntity<Admin> updateAdmin(@PathVariable(value = "id") int adminID,
        @Valid @RequestBody Admin adminDetails) throws ResourceNotFoundException {
       Admin admin = adminRepo.findById(adminID);
      admin.setId(admin.getId());
      admin.setPassword(admin.getPassword());
       final Admin updatedAdmin = adminRepo.save(admin);
       return ResponseEntity.ok(updatedAdmin);
   }

   @DeleteMapping("/admin/{id}")
   public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") int employeeId)
        throws ResourceNotFoundException {
       Admin admin = adminRepo.findById(employeeId);
adminRepo.delete(admin);
       Map<String, Boolean> response = new HashMap<>();
       response.put("deleted", Boolean.TRUE);
       return response;
   }
}

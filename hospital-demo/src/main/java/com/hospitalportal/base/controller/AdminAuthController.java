package com.hospitalportal.base.controller;
//Authentication authentication = authenticationManager

//.authenticate(new UsernamePasswordAuthenticationToken(adminData.getAdminId(), adminData.getPassword()));
////

//public ResponseEntity<Employee> loginEmployee(@RequestBody Employee employeeData){
//System.out.println(employeeData);
//Employee employee=employeeRepo.findByEmployeeId(employeeData.getEmployeeId());
////ResponseEntity<?> responseEntity = new ResponseEntity<>(ResponseObject, HttpStatus.OK);
//if(employee.getPassword().equals(employeeData.getPassword()))
//return ResponseEntity.ok(employee);
//return (ResponseEntity<Employee>)ResponseEntity.status(500);
//SecurityContextHolder.getContext().setAuthentication(authentication);
////
//Admin admin = (Admin) authentication.getPrincipal();
////
//ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(admin);
////
//List<String> roles = adminData.getAuthorities().stream()
//.map(item -> item.getAuthority())
//.collect(Collectors.toList());
////		if(admin!=null && adminData.getAdminId().equalsIgnoreCase(admin.getAdminId()) && encoder.matches(adminData.getPassword(), admin.getPassword())){
//
//}
//else
//return new ResponseEntity<Admin>(admin, HttpStatus.BAD_REQUEST);
//		if(admin==null)
//
//
//else
//return new ResponseEntity<Admin>(admin, HttpStatus.OK);

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.repository.AdminRepositoryImpl;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class AdminAuthController {

	@Autowired
	AdminRepositoryImpl adminRepo;

	
	@PostMapping("/admin/login")
	public ResponseEntity<Admin> loginAdmin(@Valid @RequestBody Admin adminData) {
		System.out.println(adminData);

		Admin admin = adminRepo.findByAdminId(adminData.getAdminId());
		if (admin.getPassword().equals(adminData.getPassword()))
			return new ResponseEntity<Admin>(admin, HttpStatus.OK);
		return new ResponseEntity<Admin>(admin, HttpStatus.BAD_REQUEST);

	}

}

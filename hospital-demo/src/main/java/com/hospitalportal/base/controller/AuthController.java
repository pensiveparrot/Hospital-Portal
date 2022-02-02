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
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.sql.Statement;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.auth.Employee;
import com.hospitalportal.base.auth.Patient;
import com.hospitalportal.base.auth.Response;
import com.hospitalportal.base.repository.AdminRepositoryImpl;
import com.hospitalportal.base.repository.EmployeeRepositoryImpl;
import com.hospitalportal.base.repository.PatientRepositoryImpl;
//import com.hospitalportal.base.util.JwtUtils;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class AuthController {


//	@Autowired
//	JwtUtils jwtUtils;
//	@Autowired
//	AuthenticationManager authenticationManager;
	@Autowired
	AdminRepositoryImpl adminRepo;
	@Autowired
	EmployeeRepositoryImpl employeeRepo;
	@Autowired
	PatientRepositoryImpl patientRepo;
	@SuppressWarnings("unchecked")
	@PostMapping("/admin/login")
	public ResponseEntity<Admin> loginAdmin(@Valid @RequestBody Admin adminData) {
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(adminData);
		
		Admin admin=adminRepo.findByAdminId(adminData.getAdminId());
		if(admin.getPassword().equals(adminData.getPassword()))
			return new ResponseEntity<Admin>(admin, HttpStatus.OK);
		return new ResponseEntity<Admin>(admin, HttpStatus.BAD_REQUEST);
//		if(admin!=null && adminData.getAdminId().equalsIgnoreCase(admin.getAdminId()) && encoder.matches(adminData.getPassword(), admin.getPassword())){
//			
//		}
//		else
//			return new ResponseEntity<Admin>(admin, HttpStatus.BAD_REQUEST);
		//		if(admin==null)
//		    
//
//		else
//            return new ResponseEntity<Admin>(admin, HttpStatus.OK);


	}

	@PostMapping("/employee/login")
	public ResponseEntity<Employee> loginEmployee(@Valid @RequestBody Employee employeeData){
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(employeeData);
		
		Employee employee=employeeRepo.findByEmployeeId(employeeData.getEmployeeId());
		if(employee.getPassword().equals(employeeData.getPassword()))
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		return new ResponseEntity<Employee>(employee, HttpStatus.BAD_REQUEST);



	}

	@PostMapping("/patient/login")
	public ResponseEntity<Patient> loginPatient(@Valid @RequestBody Patient patientData) {
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(patientData);
		
		Patient patient=patientRepo.findByPatientId(patientData.getPatientId());
		if(patient.getPassword().equals(patientData.getPassword()))
			return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		return new ResponseEntity<Patient>(patient, HttpStatus.BAD_REQUEST);



	}
	}
//	
//
//	@RequestMapping("/id")
//	public Principal id(HttpServletRequest request) {
//		String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
//		return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
//	}
//}
package com.hospitalportal.controller;
//Authentication authentication = authenticationManager

//.authenticate(new UsernamePasswordAuthenticationToken(employeeData.getEmployeeId(), employeeData.getPassword()));
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
//Employee employee = (Employee) authentication.getPrincipal();
////
//ResponseCookie jwtCookie = jwtUtils.generateJwtCookie(employee);
////
//List<String> roles = employeeData.getAuthorities().stream()
//.map(item -> item.getAuthority())
//.collect(Collectors.toList());
////		if(employee!=null && employeeData.getEmployeeId().equalsIgnoreCase(employee.getEmployeeId()) && encoder.matches(employeeData.getPassword(), employee.getPassword())){
//
//}
//else
//return new ResponseEntity<Employee>(employee, HttpStatus.BAD_REQUEST);
//		if(employee==null)
//
//
//else
//return new ResponseEntity<Employee>(employee, HttpStatus.OK);

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.model.Employee;
import com.hospitalportal.repo.EmployeeRepositoryImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class EmployeeAuthController {

	@Autowired
	EmployeeRepositoryImpl employeeRepo;

	
	@PostMapping("/employee/login")
	public ResponseEntity<Employee> loginEmployee(@Valid @RequestBody Employee employeeData) {
		System.out.println(employeeData);

		Employee employee = employeeRepo.findByEmployeeId(employeeData.getEmployeeId());
		if (employee.getPassword().equals(employeeData.getPassword()))
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		return new ResponseEntity<Employee>(employee, HttpStatus.BAD_REQUEST);

	}

}

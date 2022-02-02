//package com.hospitalportal.base.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.hospitalportal.base.auth.Employee;
//import com.hospitalportal.base.repository.EmployeeRepositoryImpl;
//
//@RestController
//@RequestMapping("/employee")
//@CrossOrigin
//public class EmployeeLoginController {
//	@Autowired
//	private EmployeeRepositoryImpl employeeRepo;
//	
//	@PostMapping("/login")
//	public ResponseEntity<Employee> loginEmployee(@RequestBody Employee employeeData){
//		System.out.println(employeeData);
//		Employee employee=employeeRepo.findByEmployeeId(employeeData.getEmployeeId());
//	    //ResponseEntity<?> responseEntity = new ResponseEntity<>(ResponseObject, HttpStatus.OK);
//		if(employee.getPassword().equals(employeeData.getPassword()))
//			return ResponseEntity.ok(employee);
//		return (ResponseEntity<Employee>)ResponseEntity.status(500);
//	}
//	
//}

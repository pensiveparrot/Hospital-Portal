package com.hospitalportal.base.controller;

import java.security.Principal;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.auth.Employee;
import com.hospitalportal.base.auth.Patient;

@RestController
@CrossOrigin
public class LoginController {

	@RequestMapping("/login")
	public boolean login(@RequestBody Admin admin, @RequestBody Patient patient, @RequestBody Employee employee) {
		return ((admin.getId()>0&& admin.getPassword().equals("password"))
				|| (patient.getPatientId() > 0 && patient.getPassword().equals("password"))
				|| (employee.getEmployeeId()>0 && employee.getPassword().equals("password")));
	}

	@RequestMapping("/id")
	public Principal id(HttpServletRequest request) {
		String authToken = request.getHeader("Authorization").substring("Basic".length()).trim();
		return () -> new String(Base64.getDecoder().decode(authToken)).split(":")[0];
	}
}
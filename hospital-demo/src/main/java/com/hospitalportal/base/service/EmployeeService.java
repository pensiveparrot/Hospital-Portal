package com.hospitalportal.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalportal.base.auth.Employee;
import com.hospitalportal.base.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public Employee login(int id, String password) {
		return (employeeRepository.findByLoginAndPassword(Integer.toString(id), password).orElse(null));

	}
}

package com.hospitalportal.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findById(String Id);
}

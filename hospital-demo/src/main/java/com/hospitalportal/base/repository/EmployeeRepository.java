package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	Employee findById(String Id);

	Optional<Employee> findByLoginAndPassword(String id, String password);
}

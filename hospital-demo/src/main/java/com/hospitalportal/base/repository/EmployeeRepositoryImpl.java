package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.auth.Employee;

@Repository
public interface EmployeeRepositoryImpl extends JpaRepository<Employee, String> {
	//Optional<Employee> findByLoginAndPassword(String id, String password);

Employee findByEmployeeId(String employeeId);

//Optional<Employee> findByEmployeeIdAndPassword(String employeeId, String password);
}

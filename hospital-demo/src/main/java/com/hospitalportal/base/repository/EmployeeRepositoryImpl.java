package com.hospitalportal.base.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.base.auth.Employee;

@Repository
public interface EmployeeRepositoryImpl extends JpaRepository<Employee, String> {

	Employee findByEmployeeId(String employeeId);

}
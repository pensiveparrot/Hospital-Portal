package com.hospitalportal.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.model.Employee;

@Repository
public interface EmployeeRepositoryImpl extends JpaRepository<Employee, String> {

	Employee findByEmployeeId(String employeeId);

}
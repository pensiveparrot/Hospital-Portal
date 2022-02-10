package com.hospitalportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.hospitalportal.model.Employee;
import com.hospitalportal.model.PatientPortal;

@Repository
public interface PatientPortalRepoImpl extends JpaRepository<PatientPortal, Long> {

//	Employee findByEmployeeId(String employeeId);

}
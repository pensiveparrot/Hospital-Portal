package com.hospitalportal.base.service;
import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.auth.Employee;
import com.hospitalportal.base.auth.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospitalportal.base.repository.AdminRepository;
import com.hospitalportal.base.repository.EmployeeRepository;
import com.hospitalportal.base.repository.PatientRepository;
@Service
public class UserService {
	@Autowired
	private AdminRepository AdminRepository;
	@Autowired
	private EmployeeRepository EmployeeRepository;
	@Autowired
	private PatientRepository PatientRepository;
	
	public void accountValidation(Patient p, Admin a, Employee e,String username, String password) {
		if (username == null || password == null)
			throw null;
		else {
		if(a.getAdminId()>0)
		{
			registerAdmin(username,password);
		}
		else if(e.getEmployeeId()>0) {
			registerEmployee(username,password);
		}
		else if(p.getPatientId()>0)
		{
			registerPatient(username,password);
		}
		else
			throw null;
		}
		
	}
	
	public Patient registerPatient(String username, String password) {
		
			Patient patient = new Patient();
			patient.setUsername(username);
			patient.setPassword(password);
			patient.setPatientId(patient.getPatientId());
			return PatientRepository.save(patient);
	}
	public Admin registerAdmin(String username, String password) {

	
			Admin admin = new Admin();
			admin.setUsername(username);
			admin.setPassword(password);
			admin.setAdminId(admin.getAdminId());
			admin.setEmployeeId(admin.getEmployeeId());
			return AdminRepository.save(admin);
		
	}
	public Employee registerEmployee(String username, String password) {

	
			Employee employee = new Employee();
			employee.setUsername(username);
			employee.setPassword(password);
			employee.setPatientId(employee.getPatientId());
			employee.setEmployeeId(employee.getEmployeeId());
			return EmployeeRepository.save(employee);
		
	}


	public Patient authenticatePatient(String username, String password) {
		return PatientRepository.findByLoginAndPassword(username, password).orElse(null);
	}
	public Admin authenticateAdmin(String username, String password) {
		return AdminRepository.findByLoginAndPassword(username, password).orElse(null);
	}
	public Employee authenticateEmployee(String username, String password) {
		return EmployeeRepository.findByLoginAndPassword(username, password).orElse(null);
	}
}

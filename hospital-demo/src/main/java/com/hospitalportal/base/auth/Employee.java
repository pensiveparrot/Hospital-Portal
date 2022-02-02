package com.hospitalportal.base.auth;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee_login")

public class Employee {




	public Employee(String employeeId, String password, List<Patient> patientId, Admin mAdmin) {
		super();
		this.employeeId = employeeId;
		this.password = password;
		this.patientId = patientId;
		this.mAdmin = mAdmin;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Id
	@Column(name="employeeId")
	private String employeeId;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", password=" + password + "]";
	}



	@Column(name = "password")
	private String password;

	
	  
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "employee_details_id", referencedColumnName = "id")
//    private EmployeeDetails employeeDetailsId;
    @OneToMany(
            mappedBy = "mPatient",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
	private List<Patient> patientId = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Admin mAdmin;
    
    
	public Admin getAdmin_login() {
		return mAdmin;
	}


	public void setAdmin_login(Admin mAdmin) {
		this.mAdmin = mAdmin;
	}


	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}





	public List<Patient> getPatientId() {
		return patientId;
	}


	public void setPatientId(List<Patient> patientId) {
		this.patientId = patientId;
	}


}

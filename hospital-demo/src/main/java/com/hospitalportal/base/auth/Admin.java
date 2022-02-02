package com.hospitalportal.base.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admin_login")
public class Admin {


	


	

	public Admin(String adminId, List<Employee> employeeId, String password) {
		super();
		this.adminId = adminId;
		this.employeeId = employeeId;
		this.password = password;
	}




	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public int hashCode() {
		return Objects.hash(adminId, password);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(adminId, other.adminId) && Objects.equals(password, other.password);
	}




	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + "]";
	}




	@Id
	@Column(name="adminId")
	private String adminId;

    @OneToMany(
            mappedBy = "mAdmin",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
	private List<Employee> employeeId = new ArrayList<>();

	


	@Column(name = "password")
	private String password;




	public String getAdminId() {
		return adminId;
	}




	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}




	public List<Employee> getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(List<Employee> employeeId) {
		this.employeeId = employeeId;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}

	







	

}

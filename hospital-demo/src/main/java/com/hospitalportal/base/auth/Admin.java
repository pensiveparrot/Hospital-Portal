package com.hospitalportal.base.auth;

import javax.persistence.Id;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
// varchar needs length 30 constraint
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "employee_id")
	private Employee employeeId;

	@Id
	@Column(name = "username", unique = true, columnDefinition = "VARCHAR(30)")
	private String username;
	@Id
	@Column(name = "password", unique = true, columnDefinition = "VARCHAR(128)")
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int adminId;

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adminId, employeeId, password, username);
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
		return adminId == other.adminId && Objects.equals(employeeId, other.employeeId)
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Admin [employeeId=" + employeeId + ", username=" + username + ", adminId=" + adminId + "]";
	}

}
/*
 * @Id
 * 
 * @Column(name = "username",unique=true,columnDefinition="VARCHAR(30)") private
 * String username;
 * 
 * @Id
 * 
 * @Column(name = "password",unique=true,columnDefinition="VARCHAR(30)") private
 * String password;
 * 
 * @Column(name = "current_role") private String role;
 */

//@Entity
//@Table(name = "admin_login")
//public class Admin {
// varchar needs length 30 constraint
/*
 * @Id
 * 
 * @Column(name = "username",unique=true,columnDefinition="VARCHAR(30)") private
 * String username;
 * 
 * @Override public String toString() { return "Admin [username=" + username +
 * ", email=" + email + "]"; }
 * 
 * @Override public int hashCode() { return Objects.hash(email, password,
 * username); }
 * 
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (getClass() != obj.getClass()) return
 * false; Admin other = (Admin) obj; return Objects.equals(email, other.email)
 * && Objects.equals(password, other.password) && Objects.equals(username,
 * other.username); } public String getUsername() { return username; } public
 * void setUsername(String username) { this.username = username; } public String
 * getEmail() { return email; } public void setEmail(String email) { this.email
 * = email; } public String getPassword() { return password; } public void
 * setPassword(String password) { this.password = password; }
 * 
 * @Column(name = "email") private String email;
 * 
 * @ManyToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "password") private String password;
 * 
 * }
 */
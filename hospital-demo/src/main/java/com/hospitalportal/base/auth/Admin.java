package com.hospitalportal.base.auth;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin_login")
public class Admin {
// varchar needs length 30 constraint
	@Id
	@Column(name = "username",unique=true,columnDefinition="VARCHAR(30)")
	private String username;

	@Override
	public String toString() {
		return "Admin [username=" + username + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, password, username);
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
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "email")
	private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "password")
	private String password;

}
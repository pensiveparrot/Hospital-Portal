package com.hospitalportal.base.service;
import com.hospitalportal.base.auth.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospitalportal.base.repository.AdminRepository;
@Service
public class UserService {
	@Autowired
	private AdminRepository AdminRepository;

	public Admin registerUser(String username, String password) {
		if (username == null || password == null)
			return null;
		else {
			Admin admin = new Admin();
			admin.setUsername(username);
			admin.setPassword(password);
			return AdminRepository.save(admin);
		}
	}

	public Admin authenticate(String email, String password) {
		return AdminRepository.findByLoginAndPassword(email, password).orElse(null);
	}
}

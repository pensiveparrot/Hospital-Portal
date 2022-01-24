package com.hospitalportal.base.user.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospitalportal.base.user.repository.UserRepository;
import com.hospitalportal.base.role.repository.RoleRepository;
import com.hospitalportal.base.user.User;

@Service
public class UserService {
	@Autowired
	private UserRepository UserRepository;
	@Autowired
	private RoleRepository RoleRepository;
	public User registerUser(String email, String password) {
		if (email == null || password == null)
			return null;
		else {
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			user.setRoles(new HashSet<>(RoleRepository.findAll()));
			return UserRepository.save(user);
		}
	}

	public User authenticate(String email, String password) {
		return UserRepository.findByEmailAndPassword(email, password).orElse(null);
	}
}

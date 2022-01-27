package com.hospitalportal.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private final AdminRepository adminRepository;

	public AdminService(AdminRepository adminRepository) {
		this.adminRepository = adminRepository;
	}

	public Admin authenticate(int id, String password) {
		return (adminRepository.findByLoginAndPassword(Integer.toString(id), password).orElse(null));

	}
}

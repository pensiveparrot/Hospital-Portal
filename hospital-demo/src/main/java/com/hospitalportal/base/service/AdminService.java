package com.hospitalportal.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.repository.AdminRepository;

@Service
public class AdminService {

@Autowired
private AdminRepository adminRepository;
		public AdminService(AdminRepository adminRepository) {
			this.adminRepository=adminRepository;
		}
		public Admin login(String id, String password)
		{
				return(adminRepository.findByLoginAndPassword(id, password).orElse(null));
			
		}
}

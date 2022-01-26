package com.hospitalportal.base.service;

import org.springframework.stereotype.Service;

import com.hospitalportal.base.repository.AdminRepository;

@Service
public class AdminService {

		private final AdminRepository adminRepository;
		public AdminService(AdminRepository adminRepository) {
			this.adminRepository=adminRepository;
		}
}

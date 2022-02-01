package com.hospitalportal.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalportal.base.auth.Admin;
import com.hospitalportal.base.repository.AdminRepositoryImpl;

@Service
public class AdminService {

	@Autowired
	private final AdminRepositoryImpl adminRepository;

	public AdminService(AdminRepositoryImpl adminRepository) {
		this.adminRepository = adminRepository;
	}

	@SuppressWarnings("unlikely-arg-type")
	public Admin authenticate(int id, String password) {

        if (((id <=0) || "".equals(id)) || (password == null)) {
            throw new IllegalArgumentException("Cannot pass null or empty values to constructor");
        }
		return (adminRepository.findByLoginAndPassword(Integer.toString(id), password).orElse(null));

	}
}

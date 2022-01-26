package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
		Admin findById(String Id);
		
		Optional<Admin> findByLoginAndPassword(String Id, String password);
}

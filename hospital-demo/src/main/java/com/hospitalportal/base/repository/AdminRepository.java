package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Admin findById(int Id);

	Optional<Admin> findByLoginAndPassword(int Id, String password);
}

package com.hospitalportal.base.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
		Admin findById(String Id);
}
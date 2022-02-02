package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.base.auth.Admin;

@Repository
public interface AdminRepositoryImpl extends JpaRepository<Admin, String> {

	Admin findByAdminId(String adminId);

	//Admin findByAdminId(String Id);
}

package com.hospitalportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalportal.model.Admin;

@Repository
public interface AdminRepositoryImpl extends JpaRepository<Admin, String> {

	Admin findByAdminId(String adminId);

}
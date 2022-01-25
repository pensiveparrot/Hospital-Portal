package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Integer> {
	Privilege findByName(String name);
}

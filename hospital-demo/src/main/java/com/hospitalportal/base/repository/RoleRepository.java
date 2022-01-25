package com.hospitalportal.base.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByName(String role);

}

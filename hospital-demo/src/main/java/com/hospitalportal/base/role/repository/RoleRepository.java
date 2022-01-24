package com.hospitalportal.base.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.role.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}

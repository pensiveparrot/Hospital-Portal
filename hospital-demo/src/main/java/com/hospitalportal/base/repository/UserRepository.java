package com.hospitalportal.base.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalportal.base.auth.User;


public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
	User findByLogin(String login);
	Optional<User> findByLoginAndPassword(String login,String password);
}

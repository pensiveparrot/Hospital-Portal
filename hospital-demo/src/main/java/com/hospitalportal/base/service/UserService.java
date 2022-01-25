package com.hospitalportal.base.service;

import java.util.List;

import com.hospitalportal.base.auth.User;



public interface UserService {
	
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserById(long id);

	List<User> findAllUsers(); 
	
	public boolean loginExists(String login);
	
	void deleteAllUsers();
	
	public boolean isUserExist(User user);
	
	
	User registerNewUserAccount(User user) throws LoginExistsException;
	
}
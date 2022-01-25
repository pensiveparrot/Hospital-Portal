package com.hospitalportal.base.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hospitalportal.base.auth.User;
import com.hospitalportal.base.repository.*;


@SuppressWarnings("serial")
public class LoginExistsException extends Exception {

	public LoginExistsException(String string) {
	}
	@Autowired
    private UserRepository userRepository;
	public boolean loginExists(String string) {
		// TODO Auto-generated constructor stub
        User user = new User();
		try {
			user = userRepository.findByLogin(string);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (user != null) {
            return true;
        }
        return false;
		
	}
		
		
}

package com.demo.bankapp.service.abstractions;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.demo.bankapp.model.User;

public interface IUserService {

	List<User> findAll();

	User findByUserName(String username);

	User createNewUser(User user);
	
	boolean isUsernameExist(String username);
	
	UserDetails loadUserByUsername(String username);

}

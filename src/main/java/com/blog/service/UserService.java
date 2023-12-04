package com.blog.service;

import com.blog.entity.User;
import com.blog.exception.UserException;

public interface UserService {

	User createUser(User user);
	
	User getUser(Integer id) throws UserException;
	
	User updateUser(User user) throws UserException;
	
	User deleteUser(Integer id) throws UserException;
}

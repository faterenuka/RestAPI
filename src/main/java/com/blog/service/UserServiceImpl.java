package com.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.exception.UserException;
import com.blog.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User createUser(User user) {

		return userRepo.save(user);
	}

	@Override
	public User getUser(Integer id) throws UserException {
		
		return userRepo.findById(id).orElseThrow(() -> new UserException("user not found with id: "+id));
	}

	@Override
	public User updateUser(User user) throws UserException {
		
		User existingUser = getUser(user.getId());
		User user1 =existingUser;
		user1.setUserName(user.getUserName());
		user1.setPassword(user.getPassword());
		user1.setEmail(user.getEmail());
		return userRepo.save(user1);
	}

	@Override
	public User deleteUser(Integer id) throws UserException {
		
		User user = getUser(id);
		userRepo.delete(user);
		return user;
	}

}

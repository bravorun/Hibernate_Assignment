package com.traineeapp.model.service;

import java.util.Optional;

import com.traineeapp.model.dao.user.User;
import com.traineeapp.model.dao.user.UserDao;
import com.traineeapp.model.dao.user.UserDaoImpl;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao = new UserDaoImpl();
	}
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);		
	}

	@Override
	public Optional<User> getUser(String username, String password) {
		return userDao.getUser(username, password);
	}

}

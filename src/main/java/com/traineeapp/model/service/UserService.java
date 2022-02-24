package com.traineeapp.model.service;

import java.util.Optional;

import com.traineeapp.model.dao.user.User;

public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);
}
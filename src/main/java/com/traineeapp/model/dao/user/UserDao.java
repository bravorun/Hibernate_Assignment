package com.traineeapp.model.dao.user;

import java.util.Optional;

public interface UserDao {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);	
}

package com.colab.ColabFarm1.user.dao;

import java.util.List;

import com.colab.ColabFarm1.user.model.User;

public interface UserDao{
	public List<User> getAllUsers();
	public void save(User user);
	public User findByEmailId(String email);
}
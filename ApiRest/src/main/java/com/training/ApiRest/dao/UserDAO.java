package com.training.ApiRest.dao;

import java.util.List;

import com.training.ApiRest.entity.User;

public interface UserDAO {
	
	public List<User> listAll();
	
	public User listById(int id);
	
	public void save(User user);
	
	public void deleteById(int id);
}

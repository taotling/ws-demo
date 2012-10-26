package com.baiing.jersey.demo.dao;

import java.util.List;

import com.baiing.jersey.demo.domain.User;

public interface UserDAO {

	public void insert(User user);
	public User getById(Long id);
	public List<Object> getAll();
	public void update(User user);
	public void delete(User user);
	
	
}

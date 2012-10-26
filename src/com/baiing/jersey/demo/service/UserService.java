package com.baiing.jersey.demo.service;

import java.util.List;

import com.baiing.jersey.demo.dao.UserDAO;
import com.baiing.jersey.demo.dao.UserDAOMongoDBImpl;

public class UserService {
	
	private UserDAO userDAO = new UserDAOMongoDBImpl();

	public List<Object> findAll(){
		
		return userDAO.getAll();
		
	}
	
	public Object findUserById(Long id){
		return userDAO.getById(id);
	}
	
	
	// setter&getter
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	
}


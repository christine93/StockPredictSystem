package com.ru.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ru.dao.PersonDAO;
import com.ru.dao.UserDAO;
import com.ru.entity.User;

@Service
public  class UserServiceImpl implements UserService{
	private UserDAO userDAO; 
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	@Transactional
	public void addUser(User u) {
		// TODO Auto-generated method stub
		userDAO.addUser(u);
	}

	@Override
	@Transactional
	public void removeUser(User u) {
		// TODO Auto-generated method stub
		userDAO.removeUser(u);
	}

	@Override
	public boolean isUser(User u) {
		// TODO Auto-generated method stub
		return true;
	}
	

}

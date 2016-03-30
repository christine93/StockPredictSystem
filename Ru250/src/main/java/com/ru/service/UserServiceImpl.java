package com.ru.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public void addUser(String userName, String email,String pwd) {
		// TODO Auto-generated method stub
		User u = new User();
		u.setEmail(email);
		u.setUsername(userName);
		u.setUserpwd(pwd);
		u.setUsertype(1);
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
		return false;
	}

	@Override
	@Transactional
	public boolean isUsernameExist(String userName) {
		// TODO Auto-generated method stub
		if(userDAO.getUserByName(userName)==null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	@Transactional
	public boolean isEmailExist(String email) {
		// TODO Auto-generated method stub
		if(userDAO.getUserByEmail(email)==null){
			return false;
		}else{
			return true;
		}
	}
	

}

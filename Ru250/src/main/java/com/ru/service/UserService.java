package com.ru.service;


import com.ru.entity.User;

public interface UserService {
	public void removeUser(User u);
	public boolean isUser(User u);
	public void addUser(String userName, String email, String pwd);
	public boolean isUsernameExist(String userName);
	public boolean isEmailExist(String email);

}
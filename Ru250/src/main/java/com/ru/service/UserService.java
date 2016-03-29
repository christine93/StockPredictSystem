package com.ru.service;


import com.ru.entity.User;

public interface UserService {
	public void addUser(User u);
	public void removeUser(User u);
	public boolean isUser(User u);

}
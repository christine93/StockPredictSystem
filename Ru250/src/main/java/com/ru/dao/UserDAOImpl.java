package com.ru.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.ru.entity.Person;
import com.ru.entity.User;

public class UserDAOImpl implements UserDAO{
	
	private static final Logger log = LoggerFactory.getLogger(PersonDAOImpl.class.getName());
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
        log.info("Person saved successfully, Person Details="+u);
	}

	@Override
	public void removeUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean userType(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getUser(User u) {
		// TODO Auto-generated method stub

	}

}

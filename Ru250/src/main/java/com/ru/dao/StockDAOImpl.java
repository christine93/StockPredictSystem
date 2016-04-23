package com.ru.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ru.entity.Person;
import com.ru.entity.Stock;
import com.ru.entity.User;

public class StockDAOImpl implements StockDAO{

	private static final Logger log = LoggerFactory.getLogger(StockDAOImpl.class.getName());
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public List<Stock> searchStock(String stock) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Stock where stock like ?");
		q.setParameter(0, stock);
		List<Stock> list = q.list();
		if(!list.isEmpty()){
			return list;
			}
		else
			return null;
	}
	
}

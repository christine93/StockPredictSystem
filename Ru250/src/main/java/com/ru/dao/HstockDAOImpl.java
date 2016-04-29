package com.ru.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ru.entity.Hstock;

public class HstockDAOImpl implements HstockDAO{

	private static final Logger log = LoggerFactory.getLogger(StockDAOImpl.class.getName());
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Hstock> searchStockByName(String stock) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Hstock where stock like ? order by date");
		q.setParameter(0, stock);
		List<Hstock> list = q.list();
		
		if(!list.isEmpty()){
			return list;
			}
		else
			return null;
	}
	
	@Override
	public List<Hstock> getHighestTen(String stock){
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("");
		q.setParameter(0, stock);
		List<Hstock> list = q.list();
		return list;
	}
	
	@Override
	public List<Hstock> getLowest(String stock){
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Hstock where stock like ? order by close ");
		q.setParameter(0, stock);
		List<Hstock> list = q.list();
		return list;
	}
	
	@Override
	public List<Hstock> getByStock(String stock){
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("");
		q.setParameter(0, stock);
		List<Hstock> list = q.list();
		return list;
	}
	
	
}

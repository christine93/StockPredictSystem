package com.ru.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.ru.entity.Stock;

public class StockDAOImpl implements StockDAO{

	private static final Logger log = LoggerFactory.getLogger(StockDAOImpl.class.getName());
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	
	@Override
	public List<Stock> searchStockByName(String stock) {
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
	
//	public List<Stock> listStock() {
//		// TODO Auto-generated method stub
//		Session session = this.sessionFactory.getCurrentSession();
//		Query q = session.createQuery("select * from Stock where stock like GOOG");
//		List<Stock> list = q.list();
//		
//		if(!list.isEmpty()){
//			return list;
//			}
//		else
//			return null;
//	}
	
	@Override
	public List<Double> getStockValue(String stockName){
		Session session = this.sessionFactory.getCurrentSession();
		Query q = session.createQuery("select value from Stock where stock = ?");
		q.setParameter(0, stockName);
		List<Float> list = q.list();
		List<Double> l = new ArrayList();
		for(Float v:list){
			Double d = Double.valueOf(v.toString());
			l.add(d);
		}
		return l;
	}

	@Override
	public void insertStock(Stock stock) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");

		BasicDataSource c = (BasicDataSource) ctx.getBean("dataSource");
		Connection conn = null;
		try {
			conn = c.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement stmt = null;
	    ResultSet rs = null;
	    String sql = "insert into stock (stock , value , volume , open , high , low , date , time) values ('"
	    +stock.getStock()+"','"+stock.getValue()+"','"+ stock.getVolume()+"','"+stock.getOpen()+"','"+stock.getHigh()
	    +"','"+stock.getLow()+"','"+stock.getDate()+"','"+stock.getTime()+"')";
	    System.out.println(sql);
	    try {
	    	stmt = conn.createStatement();
	    	stmt.executeUpdate(sql);
	    }catch (SQLException e){
	        e.printStackTrace();
	    } finally {
	      this.closeResultSet(rs);
	      this.closeStatement(stmt);
	      this.closeConnection(conn);
	    }
//		Session session = this.sessionFactory.getCurrentSession();
//		session.save(stock);
//		if (session.isOpen()) {
//            try {
//                session.getTransaction().commit();
//            } catch (Exception ex) {
//                try {
//                    session.getTransaction().rollback();
//                } catch (HibernateException e) {
//                    // TODO Auto-generated catch block
//                    // e.printStackTrace();
//                }
//            }
//            try {
//            	sessionFactory.close();
//            } catch (Exception ex) {
//            	ex.printStackTrace();
//            }
//		}
//		String sql = "insert into stock (stock , value , volume , open , high , low , date , time) values (?,?,?,?,?,?,?,?)";
//		Query q = session.createSQLQuery(sql);
//		q.setParameter(0, stock.getStock());
//		q.setParameter(1, stock.getValue());
//		q.setParameter(2, stock.getVolume());
//		q.setParameter(3, stock.getOpen());
//		q.setParameter(4, stock.getHigh());
//		q.setParameter(5, stock.getLow());
//		q.setParameter(6, stock.getDate());
//		q.setParameter(7, stock.getTime());
//		q.executeUpdate();
        log.info("Stock saved successfully, stock Details="+stock);
	}


	@Override
	public boolean checkExs(Stock stock) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
		System.out.println("-----------------");
//		BasicDataSource c = (BasicDataSource) ctx.getBean("dataSource");
//		Connection conn = null;
//		try {
//			conn = c.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(conn.toString());
		Session session = this.sessionFactory.getCurrentSession();
		String sql ="from Stock where stock =? and date = ? and time =?";
		Query q = session.createQuery(sql);
		q.setParameter(0, stock.getStock());
		q.setParameter(1, stock.getDate());
		q.setParameter(2, stock.getTime());
		List<Stock> list = q.list();
		return list.size()==0?false:true;
	}
	
	  public static void closeResultSet(ResultSet rs) {
	    if (rs != null) {
	      try {
	        rs.close();
	        rs = null;
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }

	  public static void closeStatement(Statement stm) {
	    if (stm != null) {
	      try {
	        stm.close();
	        stm = null;
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }

	  public static void closePreparedStatement(PreparedStatement pstm) {
	    if (pstm != null) {
	      try {
	        pstm.close();
	        pstm = null;
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }

	  public static void closeConnection(Connection con) {
	    if (con != null) {
	      try {
	        con.close();
	        con = null;
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	      con = null;
		}
	}
}

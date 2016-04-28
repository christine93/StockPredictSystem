package com.ru.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ru.dao.HstockDAO;
import com.ru.entity.Hstock;

public class HstockServiceImpl implements HstockService{

private HstockDAO hstockDAO;
	
	public void setHstockDAO(HstockDAO hstockDAO) 
	{
		this.hstockDAO = hstockDAO;
	}
	
	@Override
	@Transactional
	public List<Hstock> searchStockByName(String stock) {
		// TODO Auto-generated method stub
		return hstockDAO.searchStockByName(stock);
	}
}

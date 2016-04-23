package com.ru.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ru.dao.PersonDAO;
import com.ru.dao.StockDAO;
import com.ru.entity.Stock;

public class StockServiceImpl implements StockService {

	private StockDAO stockDAO;
	
	public void setStockDAO(StockDAO stockDAO) 
	{
		this.stockDAO = stockDAO;
	}
	@Override
	@Transactional
	public List<Stock> searchStock(String stock) {
		// TODO Auto-generated method stub
		return stockDAO.searchStock(stock);
	}
	
}

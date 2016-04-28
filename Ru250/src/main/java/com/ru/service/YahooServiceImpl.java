package com.ru.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ru.dao.StockDAO;
import com.ru.entity.Stock;

@Service
public class YahooServiceImpl implements YahooService{
	
	private StockDAO stockDAO;

	public void setStockDAO(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}

	@Override
	@Transactional
	public void insertStock(Stock stock) {
		// TODO Auto-generated method stub
		stockDAO.insertStock(stock);
	}

}

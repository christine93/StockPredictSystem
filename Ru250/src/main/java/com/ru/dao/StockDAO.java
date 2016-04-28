package com.ru.dao;

import java.util.List;

import com.ru.entity.Stock;

public interface StockDAO {
	public List<Stock> searchStockByName(String stock);

//	public List<Stock> listStock();

	public void insertStock(Stock stock);
	
	public boolean checkExs(Stock stock);
}

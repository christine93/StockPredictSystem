package com.ru.dao;

import java.util.List;

import com.ru.entity.Stock;

public interface StockDAO {
	public List<Stock> searchStock(String stock);
}

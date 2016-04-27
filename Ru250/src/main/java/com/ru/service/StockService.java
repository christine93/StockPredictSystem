package com.ru.service;

import java.util.List;

import com.ru.entity.Stock;

public interface StockService {

	public List<Stock> searchStockByName(String stock);
//    public List<Stock> listStock();
}

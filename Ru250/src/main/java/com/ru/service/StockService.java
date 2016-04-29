package com.ru.service;

import java.util.List;

import com.ru.entity.Stock;

public interface StockService {

	public List<Stock> searchStockByName(String stock);
//    public List<Stock> listStock();
	
	//predict 
	public List<Double> predictValueByStockANN(String stock, int dayToPredict);
	
	//predict 
	public List<Double> predictValueByHStockANN(String stock, int dayToPredict);
	
	//predict 
	public double predictValueByStockBayesian(String stock);
	
	//predict 
	public double predictValueByHStockBayesian(String stock);
}

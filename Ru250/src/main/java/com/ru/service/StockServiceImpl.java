package com.ru.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ru.algorithm.Launcher;
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
	public List<Stock> searchStockByName(String stock) {
		// TODO Auto-generated method stub
		return stockDAO.searchStockByName(stock);
	}

//	@Override
//	public List<Stock> listStock() {
//		// TODO Auto-generated method stub
//		return stockDAO.listStock();
//	}

	@Override
	@Transactional
	public List<Double> predictValueByStock(String stock, int dayToPredict) {
		// TODO Auto-generated method stub
    	List<Double> list = stockDAO.getStockValue(stock);
    	Launcher launcher = new Launcher();
    	List<Double> result = launcher.launch(list, dayToPredict);
		return result;
	}
}

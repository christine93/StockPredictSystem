package com.ru.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ru.algorithm.LauncherANN;
import com.ru.algorithm.LauncherBayesian;
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
	public List<Double> predictValueByStockANN(String stock, int dayToPredict) {
		// TODO Auto-generated method stub
    	List<Double> list = stockDAO.getStockValue(stock);
    	LauncherANN launcher = new LauncherANN();
    	List<Double> result = launcher.launch(list, dayToPredict);
		return result;
	}

	@Override
	public List<Double> predictValueByHStockANN(String stock, int dayToPredict) {
    	List<Double> list = stockDAO.getHStockValue(stock);
    	LauncherANN launcher = new LauncherANN();
    	List<Double> result = launcher.launch(list, dayToPredict);
		return result;
	}

	@Override
	public double predictValueByStockBayesian(String stock) {
		// TODO Auto-generated method stub
    	List<Double> list = stockDAO.getStockValue(stock);
    	LauncherBayesian launcher = new LauncherBayesian();
    	double result = launcher.predict(list);
		return result;
	}

	@Override
	public double predictValueByHStockBayesian(String stock) {
		// TODO Auto-generated method stub
    	List<Double> list = stockDAO.getHStockValue(stock);
    	LauncherBayesian launcher = new LauncherBayesian();
    	double result = launcher.predict(list);
		return result;
	}
}

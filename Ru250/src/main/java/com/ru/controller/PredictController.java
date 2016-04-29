package com.ru.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ru.service.StockService;

@Controller
public class PredictController {
	private StockService stockService;

	@Autowired(required=true)
	@Qualifier(value="stockService")
	public StockService getStockService() {
		return stockService;
	}

	@RequestMapping(value = "/1", method = RequestMethod.POST)
    public List<Double> predictHStockANN(@PathVariable("stock") String stock, @PathVariable("dayToPredict") int dayToPredict) {
		List<Double> list = stockService.predictValueByHStockANN(stock, dayToPredict);
        return list;
    }
	
	@RequestMapping(value = "/2", method = RequestMethod.POST)
    public List<Double> predictStockANN(@PathVariable("stock") String stock, @PathVariable("dayToPredict") int dayToPredict) {
		List<Double> list = stockService.predictValueByStockANN(stock, dayToPredict);
        return list;
    }
	
	@RequestMapping(value = "/3", method = RequestMethod.POST)
    public double predictStockBayesian(@PathVariable("stock") String stock) {
		double result = stockService.predictValueByStockBayesian(stock);
        return result;
    }
	
	@RequestMapping(value = "/4", method = RequestMethod.POST)
    public double predictHStockBayesian(@PathVariable("stock") String stock) {
		double result = stockService.predictValueByHStockBayesian(stock);
        return result;
    }
}

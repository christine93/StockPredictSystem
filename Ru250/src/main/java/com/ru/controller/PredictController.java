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
	
	@RequestMapping(value = "/5", method = RequestMethod.POST)
    public int predictValueByStockKDJ(@PathVariable("stock") String stock) {
		int result = stockService.predictValueByStockKDJ(stock);
        return result;
    }
	
	@RequestMapping(value = "/6", method = RequestMethod.POST)
    public int predictValueByHStockKDJ(@PathVariable("stock") String stock) {
		int result = stockService.predictValueByHStockKDJ(stock);
        return result;
    }
	
	@RequestMapping(value = "/7", method = RequestMethod.POST)
    public int predictValueByStockMACD(@PathVariable("stock") String stock) {
		int result = stockService.predictValueByStockMACD(stock);
        return result;
    }
	
	@RequestMapping(value = "/8", method = RequestMethod.POST)
    public int predictValueByHStockMACD(@PathVariable("stock") String stock) {
		int result = stockService.predictValueByHStockMACD(stock);
        return result;
    }
	
	@RequestMapping(value = "/9", method = RequestMethod.POST)
    public int predictValueByStockRSI(@PathVariable("stock") String stock) {
		int result = stockService.predictValueByStockRSI(stock);
        return result;
    }
	
	@RequestMapping(value = "/10", method = RequestMethod.POST)
    public int predictValueByHStockRSI(@PathVariable("stock") String stock) {
		int result = stockService.predictValueByHStockRSI(stock);
        return result;
    }
}

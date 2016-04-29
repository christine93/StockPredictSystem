package com.ru.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ru.service.StockService;

@Controller
public class PredictController {
	@Autowired(required=true)
	@Qualifier(value="stockService")
	private StockService stockService;
	
	@RequestMapping(value = "/predictAnn", method = RequestMethod.GET)
	@ResponseBody
    public List<Double> predictHStockANN(HttpServletRequest request) {
		String name = request.getParameter("name");
		List<Double> list = stockService.predictValueByHStockANN(name, 10);
		System.out.print(list.get(0));
        return list;
    }
	
	@RequestMapping(value = "/avgAnn", method = RequestMethod.GET)
	@ResponseBody
    public double avgANN(HttpServletRequest request) {
		String name = request.getParameter("name");
		double sum = 0;
		List<Double> list = stockService.predictValueByHStockANN(name, 10);
		
		for (int i= 0;i<list.size();i++){
			sum = sum+list.get(i);
		}
        return sum/(list.size());
    }
	
//	@RequestMapping(value = "/2", method = RequestMethod.POST)
//    public List<Double> predictStockANN(@PathVariable("stock") String stock, @PathVariable("dayToPredict") int dayToPredict) {
//		List<Double> list = stockService.predictValueByStockANN(stock, dayToPredict);
////		System.out.print(list.get(0));
//        return list;
//    }
	
//	@RequestMapping(value = "/3", method = RequestMethod.POST)
//    public double predictStockBayesian(@PathVariable("stock") String stock) {
//		double result = stockService.predictValueByStockBayesian(stock);
//        return result;
//    }
	
	@RequestMapping(value = "/predictBayesian", method = RequestMethod.GET)
	@ResponseBody
    public String predictHStockBayesian(HttpServletRequest request) {
		String name = request.getParameter("name");
		double result = stockService.predictValueByHStockBayesian(name);
		return String.format("%.2f", result);
    }
}

package com.ru.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ru.commons.MD5;
import com.ru.entity.Person;
import com.ru.entity.Stock;
import com.ru.entity.User;
import com.ru.service.StockService;
import com.ru.service.UserService;

@Controller

public class StockController {

	private StockService stockService;
	
	@Autowired(required=true)
	@Qualifier(value="stockService")
	public void setUserService(StockService stockService) {
		this.stockService = stockService;
	}
	
	@RequestMapping(value = "/searchstock", method = RequestMethod.GET)
    @ResponseBody
    public String searchPerson(HttpServletRequest request){
    	String name = request.getParameter("name");
    	List<Stock> stock = stockService.searchStock(name);
    	//String result = null;
    	StringBuffer result = new StringBuffer("");
    	for(int i=0;i<stock.size();i++){
    		
    		result.append("[");
    		result.append(stock.get(i).getTime());
    		result.append(",");
    		result.append(stock.get(i).getValue());
    		result.append("],");
    		
    	}
    	String r = result.toString();
    	r = "["+r.substring(0, result.length()-1)+"]";
        return r;
    }
}

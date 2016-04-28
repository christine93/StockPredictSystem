package com.ru.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ru.entity.Hstock;
import com.ru.entity.Stock;
import com.ru.service.HstockService;
import com.ru.service.StockService;

@Controller
public class HstockController {

private HstockService hstockService;
	
	@Autowired(required=true)
	@Qualifier(value="hstockService")
	public void setHstockService(HstockService hstockService) {
		this.hstockService = hstockService;
	}

	@RequestMapping(value = "/historystock", method = RequestMethod.GET)
    @ResponseBody
    public List<Hstock> searchStockByName(HttpServletRequest request){
    	String name = request.getParameter("name");
    	List<Hstock> hstock = hstockService.searchStockByName(name);
    	
        return hstock;
    }
}

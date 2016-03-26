package com.ru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainpageController {
	
	@RequestMapping("/")
	public String indexMapping()
	{
		return "mainpage";
	}
	
	@RequestMapping(value = "/login_admin", method = RequestMethod.GET)
    public String newPage(Model model) {
        return "login_admin";
    }
}

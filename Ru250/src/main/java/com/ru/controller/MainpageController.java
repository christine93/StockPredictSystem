package com.ru.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainpageController {
	
	@RequestMapping("/")
	public String indexMapping()
	{
		return "mainpage";
	}
}

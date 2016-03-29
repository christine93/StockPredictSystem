package com.ru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.ru.entity.User;
import com.ru.service.PersonService;
import com.ru.service.UserService;
public class UserController {

	private UserService userService;
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setPersonService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/login/{userName}")
    public String login(@PathVariable("userName") String userName){
        return "redirect:/mainpage";
    }
}

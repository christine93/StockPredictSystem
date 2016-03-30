package com.ru.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ru.entity.Person;
import com.ru.entity.User;
import com.ru.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	//Register
	@RequestMapping(value= "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userinfo") User u,HttpServletRequest request){
		
    	String userName = request.getParameter("userName");
    	String pwd = request.getParameter("pwd");
    	String email = request.getParameter("email");
    	if(userService.isUsernameExist(userName)||userService.isEmailExist(email)){
    		return "error";
    	}else{
    		this.userService.addUser(userName, email, pwd);
    		return "redirect:/login_admin";
		}
	}
	
	@RequestMapping(value= "/login", method = RequestMethod.POST)
	public String login (@ModelAttribute("userinfo") User u,HttpServletRequest request){
		User user = new User();
		String userName = request.getParameter("userName");
    	String pwd = request.getParameter("pwd");
    	user = userService.login(userName, pwd);
    	if(user!=null){
    		return "mainpage";
    	}else{
    		return "error";
    	}
//    	request.getSession().setAttribute("sessionname",userName);     //用Session保存用户名
//    	request.getSession().setAttribute("sessionpwd",pwd);   
		
	}


}

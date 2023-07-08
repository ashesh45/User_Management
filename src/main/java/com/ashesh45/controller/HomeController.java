package com.ashesh45.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashesh45.model.UserDtls;
import com.ashesh45.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/signin")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}

	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDtls user)
	{
		//System.out.println(user);
		
		
		UserDtls userDtls = userService.createUser(user);
		if(userDtls!=null)
		{
			System.out.println("Register Successfully");
		}else {
			System.out.println("Something went Wrong");
		}
		return "redirect:/register";
	}
}

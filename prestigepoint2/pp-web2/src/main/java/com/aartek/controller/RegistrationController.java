package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.RegistrationService;

@Controller
public class RegistrationController {
@Autowired
private RegistrationService registrationservice;
	@RequestMapping("/registration")
	public String showRegistration(Map<String,Object>map) 
	{
	System.out.println("inside registration controller");
	map.put("registrationUser",new User());
	return "registration";
	}
	
	@RequestMapping(value="/checkRegistration",method=RequestMethod.POST)
	public String checkRegistration(@ModelAttribute("registrationUser") User usr)
	{
	System.out.println("inside  check registration controller");
	System.out.println(usr.getFirstname());
	System.out.println(usr.getLastname());
	registrationservice.validateUser(usr);
	return "registration";
}
}
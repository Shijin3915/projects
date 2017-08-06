package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.repository.LoginRepository;
import com.aartek.model.User;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginrepository;
	
	public User validateUser(User usr) 
	{
		System.out.println("inside loginservice");
		System.out.println(usr.getEmail()+" "+usr.getPassword());
		loginrepository.testUser(usr);
		return usr;
		
	}
}

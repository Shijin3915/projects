package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationrepository; 
	public User validateUser(User usr) 
	{
		System.out.println("inside registration service");
		System.out.println(usr.getFirstname()+" "+usr.getLastname());
		registrationrepository.testUserRegistration(usr);
		return usr;
		
	}
}

package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.User;

@Repository
public class RegistrationRepository {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public List<User> testUserRegistration(User usr) 
	{
		System.out.println("inside registration repository");
		List<User> registration=null;
		System.out.println(usr.getEmail());
		
		String email =usr.getEmail();
	
		
		if(email!=null ) {
		 System.out.println("inside if block");
		 registration= (List<User>) hibernateTemplate.find("from User u where u.email=?",email);
		 System.out.println(registration);
		
		 if(registration.size() > 0) {
			System.out.println("email already exist");	 
		 }else {
			 
			 hibernateTemplate.save(usr);
			 System.out.println("registration successful");
		 }
		 
		 
		 
		}
		return registration;
		}}		 
		
		
		

  
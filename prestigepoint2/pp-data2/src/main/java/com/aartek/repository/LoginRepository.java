package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.aartek.model.User;

@Repository
public class LoginRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<User> testUser(User usr) 
	{
		System.out.println("inside loginrepository");
		List<User> login=null;
		System.out.println(usr.getEmail()+" "+usr.getPassword());
		
		String email =usr.getEmail();
		String password=usr.getPassword();
		
		if(email!=null && password!=null && !email.equals("") && !password.equals("") ) {
		 System.out.println("inside if block");
		 login= (List<User>) hibernateTemplate.find("from User u where u.email=? and u.password=?",email,password);
		 System.out.println(login);
		
		 if(login.size() > 0) {
			System.out.println("login successfull");	 
		 }else {
			 
			 System.out.println("invalid username or password");
		 }
		 
		 return login;
		 
		 
		}else 
		{
			System.out.println("please input valid username/password");
         return login;
		}
		
		
	}
}

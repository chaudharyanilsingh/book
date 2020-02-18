package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.db.entity.UserRegistration;
import com.book.service.UserRegistrationService;

@RestController
public class UserRegistrationController 
{

	@Autowired
	private UserRegistrationService userRegistrationService;
	
	
	@RequestMapping(path="/register",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.POST)
	public UserRegistration registerdata(@RequestBody UserRegistration userreg) 
	{ 
	
		
		userRegistrationService.registration(userreg);
		return userreg;
	}
	
	@RequestMapping(path="/updateuser",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.PUT)
	public UserRegistration updatedata(@RequestBody UserRegistration userreg) 
	{ 
		
		
		userRegistrationService.registration(userreg);
		return userreg;
	}

}

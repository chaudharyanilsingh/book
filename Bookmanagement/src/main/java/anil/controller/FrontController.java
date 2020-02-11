package anil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import anil.Books;
import anil.User;
import anil.UserLoginInterface;
import anil.UserRegistration;
import anil.UserRegistrationInterface;
@RestController
public class FrontController 
{
	@Autowired
	private UserLoginInterface repo;
	@Autowired
	private UserRegistrationInterface reporeg;
	@RequestMapping(path="/")
	public ModelAndView HomaPageCall()
	{
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	@RequestMapping(path="/login",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.POST)
	public User  logindata(@RequestBody User user) 
	{ 
			System.out.println("hello");
		return user;
		
	}

	@RequestMapping(path="/register",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.POST)
	public UserRegistration registerdata(@RequestBody UserRegistration userreg) 
	{ 
		
		
		
		return userreg;
	}
}

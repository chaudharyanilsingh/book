package com.book.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.db.entity.Author;
import com.book.service.AuthorService;
@RestController
public class AuthorController 
{

	@Autowired
	private AuthorService authorservice;
	
	@RequestMapping(path="/addauthor",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.POST)
	public Author addauthor(@RequestBody Author author) 
	{ 
		
		
	 authorservice.saveAuthor(author);
	 return author;
	}
	@RequestMapping(value = "/deleteauthor/{id}", method = RequestMethod.DELETE)
	public String deleteauthor(@PathVariable("id") int id) {
		authorservice.deleteAuthor(id);
		return "Data deleted ";
	}

	@RequestMapping(path="/author/{id}",method=RequestMethod.GET)
	public Optional<Author> updateauthor(@PathVariable("id") int id) 
	{ 
		
		
	 Optional<Author> author=authorservice.findbyid(id);
	 return author;
	}
	@RequestMapping(path="/updateauthor",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.PUT)
	public Author updateauthorbyid(@RequestBody Author author)
	{
		Author auth=authorservice.updatebyid(author);
		return auth;
	}
	
}

package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.db.entity.Publisher;
import com.book.service.PublisherService;

@RestController 
public class PublisherController {
	@Autowired
	private PublisherService publisherService;
	
	@RequestMapping(path = "/addpublisher", produces = { "application/json", "application/xml",
	"text/html" }, consumes = { "application/json", "application/xml",
			"text/html" }, method = RequestMethod.POST)
	public void addpublisher(@RequestBody Publisher publisher)
	{

		publisherService.savePublisher(publisher);
		
	}
	

}

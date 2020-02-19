package com.book.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.book.db.entity.Category;
import com.book.service.CategoryService;
@RestController
public class CategoryController 
{

	@Autowired
	private CategoryService categoryservice;
	
	@RequestMapping(path="/addcategory",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.POST)
	public String addCategory(@RequestBody Category category)
	{
		
		categoryservice.saveCategory(category);
		return "adding success";
	}
	@RequestMapping(path="/findcategorybyname",produces= {"application/json","application/xml","text/html"}, consumes= {"application/json","application/xml","text/html"},method=RequestMethod.POST)
	public Category findByCategoryName(@RequestBody Category cat)
	{
		
		Category category = categoryservice.findByName(cat.getCategoryName());
	
		return category;
		
	}
	@RequestMapping(value = "/deletecategory/{id}", method = RequestMethod.DELETE)
	public String deletecategory(@PathVariable("id") int id) {
		categoryservice.deletecategorybyid(id);
		return "Data deleted ";
	}

	
}

package com.book.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.book.db.entity.Books;

import com.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookservice;

/*	@RequestMapping(path = "/bookrreg")
	public ModelAndView bookpageshow() {
		ModelAndView mv = new ModelAndView("Booklog");
		return mv;
	}
*/
	@RequestMapping(path = "/updatebook", produces = { "application/json", "application/xml",
			"text/html" }, consumes = { "application/json", "application/xml",
					"text/html" }, method = RequestMethod.PUT)
	public Books updatebook(@RequestBody Books updatebook) {

		bookservice.updateBook(updatebook);
		return updatebook;
	}

	@RequestMapping(path = "/addbook", produces = { "application/json", "application/xml", "text/html" }, consumes = {
			"application/json", "application/xml", "text/html" }, method = RequestMethod.POST)
	public Books registerbook(@RequestBody Books bookdetail) {
		System.out.println(bookdetail);
		bookservice.saveifnotexist(bookdetail);

		return bookdetail;
	}
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable("id") int id) {
		bookservice.deleteBook(id);
		return "Data deleted ";
	}

	@GetMapping("/showbyfilters")
	public List<Books> showbooks(
			@RequestParam(value="author") int author,
			@RequestParam(value="publisher")int publisher,
			@RequestParam(value="category") int category)
	{

		return bookservice.findAllbyfilter(author,publisher,category);
	}
	@GetMapping("/show")
	public List<Books> showbookss(@RequestParam(value="pageno",defaultValue="0") int no, 
			@RequestParam(value="sortby",defaultValue="id")String sortby)
			
	{

		return bookservice.findAll(no,sortby);
	}

	@GetMapping("/show/id/{no}")
	public Books showsdbookbyid(@PathVariable("no") int num) {

		return bookservice.findById(num);
	}

	@GetMapping("/show/isbn/{no}")
	public Books showsdbookbyisbn(@PathVariable("no") int num) {

		return bookservice.findByIsbn(num);
	}

	@GetMapping("/show/tittle/{tittle}")
	public List<Books> showbooksbytittle(@PathVariable("tittle") String tittle,  @RequestParam(value="pageno", defaultValue="0") Integer pageNo) {

		return bookservice.findByTittle(tittle,pageNo);
	}

	@GetMapping("/show/author/{author}")
	public List<Books> showbooksbyauthor(@PathVariable("author") String author,@RequestParam(value="pageno") int pageno,@RequestParam(value="sortby") String sortby) {
		System.out.println(author);

		return bookservice.findByAuthor(author,pageno,sortby);
	}

	@GetMapping("/show/category/{category}")
	public Iterable<Books> showbooksbycategory(@PathVariable("category") String category,@RequestParam(value="pageno") int pageno,@RequestParam(value="sortby") String sortby) {
		return bookservice.findByCategory(category,pageno,sortby);
	}

	/*@GetMapping("/showw")
	public ModelAndView showpage(Model modelMap) {

		ModelAndView mv = new ModelAndView("view");
		mv.addObject("products", bookservice.findAll());
		System.out.println(bookservice.findAll());
		System.out.println("errror is not herere");
		System.out.println(bookservice.findById(4));

		return mv;
	}*/
}

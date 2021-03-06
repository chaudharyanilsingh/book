package com.book.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.book.db.entity.Author;
import com.book.db.entity.Books;
import com.book.db.entity.Category;
import com.book.db.entity.Publisher;
import com.book.repository.AuthorRepository;
import com.book.repository.BooksRepository;
import com.book.repository.CategoryRepository;
import com.book.repository.PublisherRepository;
import com.book.service.BookService;
@Service
public class BookserviceImp implements BookService  
{

	@Autowired
	private BooksRepository bookRepository;
	@Autowired
	private AuthorRepository authorRepository;
	

	@Autowired
	private PublisherRepository publisherRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;


	@Override
	public List<Books> findAll(int no , String sortby) 
	{
		Pageable page=PageRequest.of(no,4,Sort.by(sortby));
	    
		Page<Books>pageresult=bookRepository.findAll(page);
		return pageresult.getContent();
	}

	@Override
	public void saveifnotexist(Books bookdetail) 
	{
		System.out.println(bookdetail.getId());
		System.out.println(bookdetail.getCategory().getCategoryName());
		// save the new book
			if (bookdetail.getAuthor() != null && bookdetail.getPublisher() != null && bookdetail.getCategory().getCategoryName()!=null ) 
			{
				System.out.println("author id is "+bookdetail.getAuthor().getId());

				//System.out.println(bookdetail.getPublisher().getId());
				
				Category category=categoryRepository.findByCategoryName(bookdetail.getCategory().getCategoryName());
				bookdetail.setCategory(category);
				
				Optional<Author> optionalAuthor = authorRepository.findById(bookdetail.getAuthor().getId());
				System.out.println(optionalAuthor);
				
				Optional<Publisher> optionalpublisher = publisherRepository.findById(bookdetail.getPublisher().getId());
				System.out.println(optionalpublisher);
				
				
				if(optionalAuthor.isPresent()) 
				{
					
					bookdetail.setAuthor(optionalAuthor.get());
				
					System.out.println("save existing author");
				}
			/*	
			 * add new author in author table manually
			 * if(!optionalAuthor.isPresent()) 
				{
					
				authorRepository.save(bookdetail.getAuthor());
				}
			*/
			 if(optionalpublisher.isPresent())
				{
				 
				

					bookdetail.setPublisher(optionalpublisher.get());
					System.out.println("save existing publisher");
				}
				
					bookRepository.save(bookdetail);
				
			} 
			else 
			{
				System.out.println("No Author is provided.!! or  NO publisher is provided");
			}
	}

	@Override
	public Books findById(int id) {
		return bookRepository.findById(id).orElse(new Books());
	}

	@Override
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

	@Override
	public void saveBook(Books book) {
		bookRepository.save(book);
	}

	@Override
	public Books findByIsbn(int num) {
		
		return bookRepository.findByIsbn(num);
	}

	@Override
	public List<Books> findByTittle(String tittle , int pageno) {

        Pageable page = PageRequest.of(pageno, 3 , Sort.by("id"));
		return  bookRepository.findByTittle(tittle, page);
	}

	@Override
	public List<Books> findByAuthor(String author,int pageno,String sortby) {
		Pageable page=PageRequest.of(pageno, 3,Sort.by(sortby));
		
		
		return bookRepository.findByauthorAuthorName(author,page);
	}

	@Override
	public List<Books> findByCategory(String category,int pageno,String sortby) {
		Pageable page=PageRequest.of(pageno, 3,Sort.by(sortby));
		return bookRepository.findBycategoryCategoryName(category,page);
	}

	@Override
	public void updateBook(Books updatebook) {
		bookRepository.save(updatebook);
		
	}

	@Override
	public List<Books> findAllbyfilter( int author, int publisher, int category) {
		List<Books> books=bookRepository.findAllByFilters(author,publisher,category);
		return books;
	}
}

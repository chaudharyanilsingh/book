package com.book.service;

import java.util.List;

import com.book.db.entity.Books;
public interface BookService {

	List<Books> findAll(int no,String sortby);

	Books findById(int id);

	void deleteBook(int id);

	void saveBook(Books book);

	void saveifnotexist(Books bookdetail);

	Books findByIsbn(int num);

	List<Books> findByTittle(String tittle,int pageno);

	List<Books> findByAuthor(String author,int pageno,String sortby);

	List<Books> findByCategory(String category,int pageno,String sortby);

	void updateBook(Books updatebook);

	List<Books> findAllbyfilter( int author, int publisher, int category);

}

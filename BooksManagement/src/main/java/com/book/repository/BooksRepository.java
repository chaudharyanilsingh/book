package com.book.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.db.entity.Books;
@Repository
public interface BooksRepository extends JpaRepository< Books , Integer> 
{
	List<Books> findAll();
	Books findByIsbn(int no);
	List <Books> findByTittle(String tittle,Pageable page);
	List<Books> findByauthorAuthorName(String author,Pageable page);
	List<Books> findBycategoryCategoryName(String category,Pageable page);
	

}

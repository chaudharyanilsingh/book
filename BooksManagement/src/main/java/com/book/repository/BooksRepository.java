package com.book.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.book.db.entity.Books;
@Repository
public interface BooksRepository extends JpaRepository< Books , Integer> 
{
	Books findByIsbn(int no);
	List <Books> findByTittle(String tittle,Pageable page);
	List<Books> findByauthorAuthorName(String author,Pageable page);
	List<Books> findBycategoryCategoryName(String category,Pageable page);
	
	@Query("from Books where  author_id=?1 AND publisher_id=?2 AND category_id=?3")
	List<Books> findByFilters(int author,int publisher,int category);
	@Query("from Books where  author_id=?1 OR publisher_id=?2 OR category_id=?3")
	List<Books> findAllByFilters(int author,int publisher,int category);
	

}

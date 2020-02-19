package com.book.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.db.entity.Author;
import com.book.db.entity.Books;
@Repository
public interface AuthorRepository extends CrudRepository<Author , Integer>{
	List<Author> findByAuthorName(String AuthorName);

}

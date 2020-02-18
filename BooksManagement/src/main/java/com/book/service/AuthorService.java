package com.book.service;

import java.util.Optional;

import com.book.db.entity.Author;

public interface AuthorService
{

	 void saveAuthor(Author author);

	void deleteAuthor(int id);

	Optional<Author> findbyid(int id);

	Author updatebyid(Author author);

	


}

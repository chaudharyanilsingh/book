package com.book.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.db.entity.Author;
import com.book.repository.AuthorRepository;
import com.book.service.AuthorService;
@Service 
public class AuthorServiceImp implements AuthorService {
	@Autowired
	private AuthorRepository authorRepository;

	@Override
	public void saveAuthor(Author author) {
		authorRepository.save(author);
	}

	@Override
	public void deleteAuthor(int id) {
		authorRepository.deleteById(id);
		
	}

	@Override
	public Optional<Author> findbyid(int id) {
		
		return authorRepository.findById(id);
	}

	@Override
	public Author updatebyid(Author author) {
		authorRepository.save(author);
		return author;
	}


}

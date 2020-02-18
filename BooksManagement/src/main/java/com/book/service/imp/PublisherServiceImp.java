package com.book.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.db.entity.Publisher;
import com.book.repository.PublisherRepository;
import com.book.service.PublisherService;

@Service
public class PublisherServiceImp implements PublisherService {

	@Autowired
	private PublisherRepository publishRepository;

	@Override
	public void savePublisher(Publisher publisher) 
	{
		publishRepository.save(publisher);
	

	}

}

package com.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.db.entity.Publisher;

@Repository 
public interface PublisherRepository extends CrudRepository< Publisher , Integer>{

}

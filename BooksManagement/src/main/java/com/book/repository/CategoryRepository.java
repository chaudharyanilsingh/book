package com.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.db.entity.Category;

@Repository 
public interface CategoryRepository extends CrudRepository<Category,Integer> {

	

	Category findByCategoryName(String name);
	

}

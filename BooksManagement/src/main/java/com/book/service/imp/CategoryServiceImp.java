package com.book.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.db.entity.Category;
import com.book.repository.CategoryRepository;
import com.book.service.CategoryService;
@Service 
public class CategoryServiceImp implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public Category findByName(String name) 
	{
		Category category=categoryRepository.findByCategoryName(name);
		
		return category;
	}
	@Override
	public void saveCategory(Category category) {
	
		categoryRepository.save(category);
		
	}

}

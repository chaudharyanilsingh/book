package com.book.service;

import java.util.List;
import java.util.Optional;

import com.book.db.entity.Category;

public interface CategoryService 
{
	Category  findByName(String name);
	void saveCategory(Category category);

}

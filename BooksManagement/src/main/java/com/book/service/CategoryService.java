package com.book.service;
import com.book.db.entity.Category;

public interface CategoryService 
{
	Category  findByName(String name);
	void saveCategory(Category category);
	void deletecategorybyid(int id);

}

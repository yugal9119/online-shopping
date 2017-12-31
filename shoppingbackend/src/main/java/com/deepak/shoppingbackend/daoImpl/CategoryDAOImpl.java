package com.deepak.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.deepak.shoppingbackend.dao.CategoryDAO;
import com.deepak.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	private static List<Category> categories = new ArrayList<Category>();
	static {
		
	//First category 
		
		Category category = new Category();	
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is for Television.");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		
	//Second category 
		
		 category = new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is for Mobile.");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
	//Third category 
		
		category = new Category();
		
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("this is for Laptop.");
		category.setImageURL("CAT_3.png");	
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

}

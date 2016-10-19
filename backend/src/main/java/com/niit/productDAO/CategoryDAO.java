package com.niit.productDAO;

import java.util.List;

import com.niit.backend.Categories;
public interface CategoryDAO {
	public List<Categories> getAll();
	public void insert(Categories p);
	public void update(Categories p);
	public Categories getById(int id);
	public void delete(int id);

}

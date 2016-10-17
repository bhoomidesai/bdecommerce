package com.niit.service;

import java.util.List;

import com.niit.backend.ProductModel;
import com.niit.productDAO.ProductDAO;

public interface ProductModelService {
	
    
	public List<ProductModel> getAll();
	public void insert(ProductModel p);
	public void update(ProductModel p);
	public ProductModel getById(int id);
	public void delete(int id);

}

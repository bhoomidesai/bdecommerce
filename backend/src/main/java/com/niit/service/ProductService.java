package com.niit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.backend.ProductModel;
import com.niit.productDAO.ProductDAO;

@Service("ProductModelService")
@Transactional

public class ProductService implements ProductModelService{
	 @Autowired
	    private ProductDAO dao;
	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return this.dao.getAll();
	}

	public void insert(ProductModel p) {
		// TODO Auto-generated method stub
		this.dao.insert(p);
	}

	public void update(ProductModel p) {
		// TODO Auto-generated method stub
		this.dao.update(p);
	}

	public ProductModel getById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getById(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		this.dao.delete(id);
	}

}

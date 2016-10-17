package com.niit.productDAO;
import java.util.*;
import com.niit.backend.ProductModel;
public interface ProductDAO {
	
public List<ProductModel> getAll();
public void insert(ProductModel p);
public void update(ProductModel p);
public ProductModel getById(int id);
public void delete(int id);
}

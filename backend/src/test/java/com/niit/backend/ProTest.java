package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.*;
import com.niit.productDAO.ProductDAO;


public class ProTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
     ctxt.scan("com.niit");
     ctxt.refresh();
     ProductDAO productDAO = ctxt.getBean(ProductDAO.class);
     ProductModel p = new ProductModel();
     p.setId(1);
     p.setName("iPhone");
     p.setPrice(23390);
     p.setDesc("7 plus");
     productDAO.insert(p);
     ctxt.close();
	}

}


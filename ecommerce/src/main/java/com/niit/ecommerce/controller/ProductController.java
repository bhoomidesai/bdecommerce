package com.niit.ecommerce.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.backend.ProductModel;
import com.niit.productDAO.ProductDAO;
import com.niit.productDAO.ProductDAOImpl;


@Controller
public class ProductController
{
	@Autowired
	ProductDAO proDAO= new ProductDAOImpl();
	@RequestMapping(value={"/v/get"})
	@ResponseBody List<ProductModel> view()
	{
		return  proDAO.getAll();
	}

}

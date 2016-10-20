package com.niit.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.backend.ProductModel;
import com.niit.productDAO.ProductDAO;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private ProductDAO p;
	
	@RequestMapping(value = "/delete/{id}")
	public String deletedata(@PathVariable("id") Integer st) {
		p.delete(st);	
		return "redirect:/admin/viewall";
	}
	@RequestMapping(value = "/viewall")
	public String all(Model model) {
		model.addAttribute("product", new ProductModel());
		model.addAttribute("products", p.getAll());
		return "admin";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(@Valid @ModelAttribute("product") ProductModel product,BindingResult results, Model model) {
		if(results.hasErrors())
		{
			model.addAttribute("product",product);
			model.addAttribute("products",p.getAll());
			return "admin";
		}
		if (product.getId() == 0) {
			// new product, add it
			p.insert(product);
		} else {
			// existing product, call update
			p.update(product);
		}
		return "redirect:/admin/viewall";
	}
	@RequestMapping("/edit/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		model.addAttribute("product", p.getById(id));
		model.addAttribute("products", p.getAll());
		return "admin";
	}
}

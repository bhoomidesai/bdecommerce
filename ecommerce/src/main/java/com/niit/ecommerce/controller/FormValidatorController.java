package com.niit.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.backend.ProductModel;
import com.niit.backend.Registration;
@Controller	
public class FormValidatorController {
	@RequestMapping(value="/admin/insert1", method=RequestMethod.POST)
    public String submitForm(@Valid ProductModel sub, BindingResult result, Model m) {
        if(result.hasErrors()) {
            return "admin";
        } 
        m.addAttribute("message", "Successfully saved User: " + sub.toString());
        return "admin";
    }
}

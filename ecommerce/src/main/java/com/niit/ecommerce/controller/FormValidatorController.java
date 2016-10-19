package com.niit.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.backend.Registration;
@Controller	
public class FormValidatorController {
	@RequestMapping(value="/admin/insert", method=RequestMethod.POST)
    public String submitForm(@Valid Registration sub, BindingResult result, Model m) {
        if(result.hasErrors()) {
            return "formPage";
        }
         
        m.addAttribute("message", "Successfully saved User: " + sub.toString());
        return "formPage";
    }

}

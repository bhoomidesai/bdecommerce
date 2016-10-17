package com.niit.HibernateConfuration;

import java.util.List;
import java.util.Locale;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.niit.backend.*;
import com.niit.service.ProductService;

 
@Controller
@RequestMapping("/")
public class AppController {
 
private ProductService p;
	
	@Autowired(required=true)
	@Qualifier(value="ProductService")
	public void setPersonService(ProductService ps){
		this.p = ps;
	}
	
	@RequestMapping(value = "/viewall", method = RequestMethod.GET)
	public String getAll(Model model) {
		model.addAttribute("person", new ProductModel());
		model.addAttribute("listPersons", this.p.getAll());
		return "person";
	}
	
	//For add and update person both
	@RequestMapping(value= "/person/add", method = RequestMethod.POST)
	public String insert(@ModelAttribute("person") ProductModel p){
		
		if(p.getId() == 0){
			//new person, add it
			this.p.insert(p);
		}else{
			//existing person, call update
			this.p.update(p);
		}
		
		return "redirect:/Products";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id){
		
        this.p.delete(id);
        return "redirect:/persons";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", this.p.getById(id));
        model.addAttribute("listPersons", this.p.getAll());
        return "Product";
    }
}

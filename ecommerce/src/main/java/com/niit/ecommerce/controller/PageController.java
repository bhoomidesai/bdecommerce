package com.niit.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		return mv;
	}
	@RequestMapping(value = {"/aboutus", "/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("aboutus");
		return mv;
	}
	@RequestMapping(value = { "/login"})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	@RequestMapping(value = { "/contact", "/contactus"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("contactus");
		return mv;
	}
	@RequestMapping(value = { "/reg", "/registration"})
	public ModelAndView reg() {
		ModelAndView mv = new ModelAndView("reg");
		return mv;
	}
	@RequestMapping(value = { "/view"})
	public ModelAndView viewall() {
		ModelAndView mv = new ModelAndView("viewitems");
		return mv;
	}
	/*@RequestMapping(value = { "/viewipad"})
	public ModelAndView viewipad() {
		ModelAndView mv = new ModelAndView("viewitems");
		mv.addObject("pro", "ipad");
		return mv;
	}
	@RequestMapping(value = {"/viewiphone"})
	public ModelAndView viewiphn() {
		ModelAndView mv = new ModelAndView("viewitems");
		mv.addObject("pro", "iphone");
		return mv;
	}*/
	@RequestMapping(value = {"/{pro}"})
	public ModelAndView viewmac(@PathVariable("pro") String q) {
		ModelAndView mv = new ModelAndView("viewitems");
		mv.addObject("pro", q);
		return mv;
	}
	
	@RequestMapping(value = {"/cart"})
	public ModelAndView cart() {
		ModelAndView mv = new ModelAndView("cart");
		return mv;
	}@RequestMapping(value = {"/ecommerce{id1}"})
	public ModelAndView viewdetail(@PathVariable("id1") String q) {
		ModelAndView mv = new ModelAndView("viewdetail");
		mv.addObject("id1", q);
		return mv;
	}
	
	
}

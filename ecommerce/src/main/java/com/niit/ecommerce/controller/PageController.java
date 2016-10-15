package com.niit.ecommerce.controller;

import org.springframework.stereotype.Controller;
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
	public ModelAndView view() {
		ModelAndView mv = new ModelAndView("viewitems");
		return mv;
	}
}

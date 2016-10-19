package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.productDAO.RegistrationDAO;


public class ProTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext();
     ctxt.scan("com.niit");
     ctxt.refresh();
     RegistrationDAO cDAO = ctxt.getBean(RegistrationDAO.class);
     
     Registration c = new Registration();
     c.setUname("Bhoomi");
     c.setEmail("bhoomi.desai21@gmail.com");
     c.setPwd("123");
     c.setAddress("Baroda");
     cDAO.insert(c);
     ctxt.close();
	}

}


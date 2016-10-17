package com.niit.ecommerce.controller;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration;

import com.niit.backend.ProductModel;
public class MainConfig {
 
		
		int i = 0;	
		public static void main(String[] args) 
		{	
			new ProductModel().id = 5;	
			//creating configuration object 
			Configuration cfg=new Configuration(); 
			cfg.configure("com.niit");
			//populates the data of the configuration file
			//creating seession factory object 
			SessionFactory factory=cfg.buildSessionFactory();	
			//creating session object
			Session session=factory.openSession();	
			//creating transaction object 
			Transaction t=session.beginTransaction(); 
			ProductModel e1=new ProductModel (); 
			e1.setId(115); 
			e1.setName("ipad"); 
			e1.setDesc("mini"); 
			session.persist(e1);//persisting the object
			t.commit();//transaction is commited 
			session.close(); 
	System.out.println("successfully saved"); }
		
	}



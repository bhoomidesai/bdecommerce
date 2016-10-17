package com.niit.productDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.backend.ProductModel;
@Service("productDAO")

@Repository
public class ProductDAOImpl implements ProductDAO
{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public void insert(ProductModel p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		
	}
	public void update(ProductModel p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		
	}
	public ProductModel getById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		ProductModel p = (ProductModel) session.load(ProductModel.class, new Integer(id));
		return p;
	}
	public void delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		ProductModel p = (ProductModel) session.load(ProductModel.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		
	}

	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		List<ProductModel> plist;
		ProductModel obj = new ProductModel();
		Session session = this.sessionFactory.getCurrentSession();
		plist = session.createQuery("from ProductModel").list();
		for(ProductModel p : plist){
			plist.add(obj);
		}
		return plist;	}
}

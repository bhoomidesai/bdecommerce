package com.niit.productDAO;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.ProductModel;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {
	@Autowired	
	private SessionFactory sessionFactory;
	
	
	public void insert(ProductModel p) {
		sessionFactory.getCurrentSession().persist(p);
	}
	
	public List<ProductModel> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM ProductModel").list();
	}

	public void update(ProductModel p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
	}

	public ProductModel getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ProductModel.class,id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));		}
	}

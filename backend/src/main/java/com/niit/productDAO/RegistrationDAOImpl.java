package com.niit.productDAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.Registration;
@Repository
@Transactional
public class RegistrationDAOImpl implements RegistrationDAO{
	@Autowired	
	private SessionFactory sessionFactory;
	
	
	public void insert(Registration p) {
		sessionFactory.getCurrentSession().persist(p);
	}
	
	public List<Registration> getAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("FROM Registration").list();
	}

	public void update(Registration p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
	}

	public Registration getById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Registration.class,id);
		}

	public void delete(int id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(getById(id));
	}

}

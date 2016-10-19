package com.niit.productDAO;

import java.util.List;

import com.niit.backend.Registration;

public interface RegistrationDAO {
	public List<Registration> getAll();
	public void insert(Registration p);
	public void update(Registration p);
	public Registration getById(int id);
	public void delete(int id);

}

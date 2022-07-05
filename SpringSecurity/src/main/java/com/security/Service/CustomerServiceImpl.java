package com.security.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.Domain.Customer;
import com.security.Repository.*;


@Service
public class CustomerServiceImpl implements CustomerService 
{
	
	@Autowired
	CustomerRepository cr;

	@Override
	public void AddCustomer(Customer c) 
	{
		cr.save(c);
		// TODO Auto-generated method stub
		

	}

	@Override
	public Customer FindCustomerById(int id) 
	{
		// TODO Auto-generated method stub
		//Customr c=cr.findB
		return cr.findById(id).get();
	}

	@Override
	public List<Customer> FindAllCustomers() 
	{
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public void DeleteCustomer(int id) 
	{
		// TODO Auto-generated method stub
		cr.deleteById(id);

	}

}

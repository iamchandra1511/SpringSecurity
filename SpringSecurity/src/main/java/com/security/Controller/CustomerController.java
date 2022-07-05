package com.security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.security.Service.*;
import java.util.List;
import com.security.Domain.*;

@RestController
@RequestMapping("/Customer")
@ComponentScan(basePackages = "com.security")

public class CustomerController 
{
	@Autowired
	CustomerServiceImpl ci;
	@GetMapping("/GetAllCustomers")
   public List<Customer> GetAllCustomers()
   {
	     return ci.FindAllCustomers();
   }
	@GetMapping("/Get")
   public Customer GetCustomer(int id)
   {
	   return ci.FindCustomerById(id);
   }
	@GetMapping("/GetCustomerObject")
	public ResponseEntity<Customer>getCustomer()
	{
		Customer c=new Customer();
		c.setName("Prasad");
		c.setId(5);
		HttpHeaders headers=new HttpHeaders();
		headers.add("token","token value");
		return ResponseEntity.ok().headers(headers).body(c);
		
	}
}

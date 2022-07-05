package com.security.Service;
import com.security.Domain.Customer;
import java.util.*;

public interface CustomerService 
{
     public void AddCustomer(Customer c);
     public Customer FindCustomerById(int id);
     public List<Customer>FindAllCustomers();
     public void DeleteCustomer(int id);
     
}

package com.security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.Domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> 
{

}

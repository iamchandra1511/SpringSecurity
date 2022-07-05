package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;

@RestController
@ComponentScan(basePackages = "com.example.demo")
@RequestMapping("/user")
public class UserController 
{
  
	@Autowired
	//private UserRepository userRepository;
	UserService userservice;
	
	@GetMapping
	public List<User> getAllUsers()
	{
		return userservice.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id")int id)
	{
		System.out.println("Method Executed");
		return userservice.getUserById(id);
	}
	
	/*
	@PostMapping
	public User saveUser(@Validated @RequestBody User user)
	{
		return userRepository.save(user);
	}
	*/
  
}

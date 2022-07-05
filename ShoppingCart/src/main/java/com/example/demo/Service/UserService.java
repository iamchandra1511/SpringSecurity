package com.example.demo.Service;

import java.util.List;

import com.example.demo.Domain.User;

public interface UserService 
{
	
	User addUser(User user);
	User getUserById(int id);
	void updateUser(User user);
	void deleteUserById(int id);
	List<User>getAllUsers();
	

}

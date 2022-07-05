package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService 
{

	@Autowired
	private UserRepository userrepo;
	@Override
	public User addUser(User user) 
	{
		// TODO Auto-generated method stub
		return userrepo.save(user);
		
	}

	@Override
	public User getUserById(int id) 
	{
		// TODO Auto-generated method stub
		return userrepo.findById(id).get();
	}

	@Override
	public void updateUser(User user) 
	{
		// TODO Auto-generated method stub
		User u=userrepo.findById(user.getId()).orElseThrow();
		userrepo.save(u);

	}

	@Override
	public void deleteUserById(int id) 
	{
		// TODO Auto-generated method stub
		try
		{
		   userrepo.deleteById(id);
		}
		catch(DataAccessException ex)
		{
			throw new RuntimeException(ex.getMessage());
		}

	}

	@Override
	public List<User> getAllUsers() 
	{
		// TODO Auto-generated method stub
		return (List<User>) userrepo.findAll();
	}

}

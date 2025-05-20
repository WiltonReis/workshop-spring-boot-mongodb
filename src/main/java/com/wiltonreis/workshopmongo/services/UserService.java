package com.wiltonreis.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiltonreis.workshopmongo.entities.User;
import com.wiltonreis.workshopmongo.repositories.UserRepository;
import com.wiltonreis.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
}

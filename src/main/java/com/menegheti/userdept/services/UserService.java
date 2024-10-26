package com.menegheti.userdept.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menegheti.userdept.entites.User;
import com.menegheti.userdept.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User update(Long id, User obj) {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
	}

}

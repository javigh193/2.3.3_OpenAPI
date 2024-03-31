package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.User;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.UserRepository;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl(BaseRepository<User, Long> baseRepository) {
		super(baseRepository);
	}
	
}

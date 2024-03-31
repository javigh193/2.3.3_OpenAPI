package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Phone;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.PhoneRepository;

@Service
public class PhoneServiceImpl extends BaseServiceImpl<Phone, Long> implements PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	public PhoneServiceImpl(BaseRepository<Phone, Long> baseRepository) {
		super(baseRepository);
	}
	
}

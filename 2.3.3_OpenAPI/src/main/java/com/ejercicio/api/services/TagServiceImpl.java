package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Tag;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.PhoneRepository;

@Service
public class TagServiceImpl extends BaseServiceImpl<Tag, Long> implements TagService {

	@Autowired
	private PhoneRepository tagRepository;
	
	public TagServiceImpl(BaseRepository<Tag, Long> baseRepository) {
		super(baseRepository);
	}
	
}

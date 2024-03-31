package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Detail;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.DetailRepository;

@Service
public class DetailServiceImpl extends BaseServiceImpl<Detail, Long> implements DetailService {
	
	@Autowired
	private DetailRepository detailRepository;
	
	public DetailServiceImpl(BaseRepository<Detail, Long> baseRepository) {
		super(baseRepository);
	}
	
}

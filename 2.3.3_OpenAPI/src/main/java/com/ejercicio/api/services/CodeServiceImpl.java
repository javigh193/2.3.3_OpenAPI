package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Code;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.CodeRepository;

@Service
public class CodeServiceImpl extends BaseServiceImpl<Code, Long> implements CodeService{
	
	@Autowired
	private CodeRepository codeRepository;
	
	public CodeServiceImpl(BaseRepository<Code, Long> baseRepository) {
		super(baseRepository);
	}
}

package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Blog;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.BlogRepository;

@Service
public class BlogServiceImpl extends BaseServiceImpl<Blog, Long> implements BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	public BlogServiceImpl(BaseRepository<Blog, Long> baseRepository) {
		super(baseRepository);
	}
	
}

package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Article;
import com.ejercicio.api.repositories.ArticleRepository;
import com.ejercicio.api.repositories.BaseRepository;

@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article, Long> implements ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	public ArticleServiceImpl(BaseRepository<Article, Long> baseRepository) {
		super(baseRepository);
	}
	
}

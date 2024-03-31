package com.ejercicio.api.repositories;

import org.springframework.stereotype.Repository;

import com.ejercicio.api.entities.Article;

@Repository
public interface ArticleRepository extends BaseRepository<Article, Long> {

}

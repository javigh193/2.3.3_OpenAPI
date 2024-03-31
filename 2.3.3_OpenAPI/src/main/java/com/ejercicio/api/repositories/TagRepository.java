package com.ejercicio.api.repositories;

import org.springframework.stereotype.Repository;

import com.ejercicio.api.entities.Tag;

@Repository
public interface TagRepository extends BaseRepository<Tag, Long> {

}

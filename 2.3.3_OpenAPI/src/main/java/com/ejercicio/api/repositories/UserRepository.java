package com.ejercicio.api.repositories;

import org.springframework.stereotype.Repository;

import com.ejercicio.api.entities.User;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

}

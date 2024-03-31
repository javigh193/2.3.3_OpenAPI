package com.ejercicio.api.repositories;

import org.springframework.stereotype.Repository;

import com.ejercicio.api.entities.Phone;

@Repository
public interface PhoneRepository extends BaseRepository<Phone, Long> {

}

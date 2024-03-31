package com.ejercicio.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.api.entities.Detail;
import com.ejercicio.api.services.DetailServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/details")
public class DetailController extends BaseControllerImpl<Detail, DetailServiceImpl> {

}

package com.ejercicio.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.api.entities.Tag;
import com.ejercicio.api.services.TagServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tags")
public class TagController extends BaseControllerImpl<Tag, TagServiceImpl> {

}

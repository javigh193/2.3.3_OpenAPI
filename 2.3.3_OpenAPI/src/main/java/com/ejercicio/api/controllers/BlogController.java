package com.ejercicio.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.api.entities.Blog;
import com.ejercicio.api.services.BlogServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/blogs")
public class BlogController extends BaseControllerImpl<Blog, BlogServiceImpl> {

}

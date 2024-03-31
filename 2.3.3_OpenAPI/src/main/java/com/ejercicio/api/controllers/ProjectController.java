package com.ejercicio.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.api.entities.Project;
import com.ejercicio.api.services.ProjectServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/projects")
public class ProjectController extends BaseControllerImpl<Project, ProjectServiceImpl> {

}

package com.ejercicio.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.api.entities.Project;
import com.ejercicio.api.repositories.BaseRepository;
import com.ejercicio.api.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project, Long> implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public ProjectServiceImpl(BaseRepository<Project, Long> baseRepository) {
		super(baseRepository);
	}
	
}

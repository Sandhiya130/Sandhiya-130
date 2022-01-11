package com.marticus.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.project.entity.ProjectEntity;
import com.marticus.project.repo.ProjectRepo;


@Service
public class ProjectService {

	@Autowired
	ProjectRepo projectRepo;
	
	public List<ProjectEntity> getAllProjects() {
		return projectRepo.findAll() ;
	}

	public ProjectEntity getProjectById(int id) {
		return projectRepo.findProjectsById(id);
	}

	

	public ProjectEntity getProjectByProjectName(String name) {
		return projectRepo.findProjectsByProjectName(name);
	}

	public ProjectEntity getProjectByTechId(int id) {
		return projectRepo.findProjectsByTechId(id);
	}

	public  ProjectEntity save(ProjectEntity projectEntity) {
		return projectRepo.save(projectEntity);
	}

}

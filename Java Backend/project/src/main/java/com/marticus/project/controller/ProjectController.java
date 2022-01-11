package com.marticus.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.project.entity.ProjectEntity;
import com.marticus.project.service.ProjectService;

import java.util.List;



@RestController
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/")
	public ResponseEntity<List<ProjectEntity>> getAll()
	{
		List<ProjectEntity> projects =  projectService.getAllProjects();
		return ResponseEntity.ok(projects);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProjectEntity> getById(@PathVariable("id") int id)
	{
		ProjectEntity project =  projectService.getProjectById(id);
		return ResponseEntity.ok(project);
	}
	
	@GetMapping("/name/{projectname}")
	public ResponseEntity<ProjectEntity> getById(@PathVariable("projectname") String name)
	{
		ProjectEntity project =  projectService.getProjectByProjectName(name);
		return ResponseEntity.ok(project);
	}
	
	@GetMapping("/tech/{id}")
	public ResponseEntity<ProjectEntity> getByTechId(@PathVariable("id") int id)
	{
		ProjectEntity project =  projectService.getProjectByTechId(id);
		return ResponseEntity.ok(project);
	}
	

}

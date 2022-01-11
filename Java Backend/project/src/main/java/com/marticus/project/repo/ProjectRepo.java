package com.marticus.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.project.entity.ProjectEntity;



@Repository
public interface ProjectRepo extends JpaRepository<ProjectEntity, Integer>{

	ProjectEntity findProjectsById(int id);


	ProjectEntity findProjectsByProjectName(String name);


	ProjectEntity findProjectsByTechId(int id);

}


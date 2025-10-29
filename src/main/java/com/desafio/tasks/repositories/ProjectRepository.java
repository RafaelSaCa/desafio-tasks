package com.desafio.tasks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.tasks.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}

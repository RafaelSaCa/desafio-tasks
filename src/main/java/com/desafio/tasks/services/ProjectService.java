package com.desafio.tasks.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.tasks.dto.ProjectDto;
import com.desafio.tasks.mapper.ProjectMapper;
import com.desafio.tasks.models.Project;
import com.desafio.tasks.repositories.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository repository;
    @Autowired
    private ProjectMapper mapper;

    @Transactional
    public Project create(ProjectDto request) {
        return repository.save(mapper.toEntity(request));
    }
    

}

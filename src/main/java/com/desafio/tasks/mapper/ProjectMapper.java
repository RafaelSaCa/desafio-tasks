package com.desafio.tasks.mapper;

import org.mapstruct.Mapper;


import com.desafio.tasks.dto.ProjectDto;
import com.desafio.tasks.models.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectDto toDto(Project project);

    
    Project toEntity(ProjectDto projectDto);
}

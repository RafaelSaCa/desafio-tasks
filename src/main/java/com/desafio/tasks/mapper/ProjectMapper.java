package com.desafio.tasks.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.desafio.tasks.dto.ProjectDto;
import com.desafio.tasks.models.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectDto toDto(Project project);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "tasks", ignore = true)
    Project toEntity(ProjectDto projectDto);
}

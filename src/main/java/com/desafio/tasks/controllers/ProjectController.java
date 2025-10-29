package com.desafio.tasks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.tasks.dto.ProjectDto;
import com.desafio.tasks.models.Project;
import com.desafio.tasks.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

        @Autowired
        private ProjectService service;

        @PostMapping
        public ResponseEntity<Project> create(@RequestBody ProjectDto request) {
                Project project = service.create(request);
                return ResponseEntity.status(HttpStatus.CREATED).body(project);
        }

        @GetMapping
        public ResponseEntity<List<Project>> listAll() {
                List<Project> projects = service.listAll();
                return ResponseEntity.ok(projects);

        }
}

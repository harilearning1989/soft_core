package com.web.soft.services;

import com.web.soft.mappers.SoftCoreMapper;
import com.web.soft.repos.DeveloperRepository;
import com.web.soft.repos.ProjectsRepository;
import com.web.soft.response.ProjectsDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectsRepository projectsRepository;

    public ProjectServiceImpl(ProjectsRepository projectsRepository) {
        this.projectsRepository = projectsRepository;
    }

    @Override
    public List<ProjectsDTO> getAllProjectsDTOs() {
        return projectsRepository.findAll().stream()
                .map(SoftCoreMapper::toDto)
                .collect(Collectors.toList());
    }
}

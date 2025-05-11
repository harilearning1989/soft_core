package com.web.soft.mappers;

import com.web.soft.models.Developer;
import com.web.soft.models.Projects;
import com.web.soft.models.Services;
import com.web.soft.response.DeveloperDTO;
import com.web.soft.response.ProjectsDTO;
import com.web.soft.response.ServiceDTO;

import java.util.Arrays;
import java.util.List;

public class SoftCoreMapper {
    public static ServiceDTO toDto(Services service) {
        return new ServiceDTO(
                service.getServiceId(),
                service.getIcon(),
                service.getServiceName(),
                service.getDescription(),
                service.getCategory(),
                service.getPrice(),
                service.getCreatedAt()
        );
    }

    public static DeveloperDTO toDto(Developer developer) {
        String skills = developer.getSkills();
        skills = skills.replaceAll("[{}\"]", ""); // Remove curly braces and quotes
        List<String> skillList = Arrays.asList(skills.split(","));
        return new DeveloperDTO(
                developer.getId(),
                developer.getFullName(),
                developer.getEmail(),
                developer.getPhoneNumber(),
                skillList,
                developer.getExperienceYears(),
                developer.getIsActive(),
                developer.getPhotoUrl(),
                developer.getPhoto()
        );
    }

    public static ProjectsDTO toDto(Projects project) {
        return new ProjectsDTO(
                project.getProjectId(),
                project.getProjectName(),
                project.getDescription(),
                project.getStartDate(),
                project.getEndDate(),
                project.getClientName(),
                project.getStatus(),
                project.getCreatedAt()
        );
    }
}


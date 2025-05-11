package com.web.soft.response;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ProjectsDTO(Long projectId,
                          String projectName,
                          String description,
                          LocalDate startDate,
                          LocalDate endDate,
                          String clientName,
                          String status,
                          LocalDateTime createdAt) {
}

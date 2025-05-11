package com.web.soft.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record TrainingDTO(
        Integer trainingId,
        String title,
        String description,
        String trainerName,
        LocalDate startDate,
        LocalDate endDate,
        String mode,
        BigDecimal fee,
        LocalDateTime createdAt
) {}


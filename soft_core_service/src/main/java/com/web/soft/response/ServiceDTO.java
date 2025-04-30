package com.web.soft.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ServiceDTO(
        Long id,
        String icon,
        String title,
        String description,
        String category,
        BigDecimal price,
        LocalDateTime createdAt
) {}


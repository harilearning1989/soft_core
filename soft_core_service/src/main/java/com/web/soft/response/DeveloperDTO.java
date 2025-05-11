package com.web.soft.response;

import java.util.List;

public record DeveloperDTO(
        Integer id,
        String fullName,
        String email,
        String phoneNumber,
        List<String> skills,
        Integer experienceYears,
        Boolean isActive,
        String photoUrl,
        byte[] photo
) {}


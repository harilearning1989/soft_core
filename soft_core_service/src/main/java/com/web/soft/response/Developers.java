package com.web.soft.response;

public record Developers(
        int id,
        String fullName,
        String email,
        String phone,
        int experienceYears,
        String skills,
        String photo,
        boolean isActive
) {
}

package com.web.soft.services;

import com.web.soft.response.DeveloperDTO;

import java.util.List;

public interface DeveloperService {
    List<DeveloperDTO> getAllAvailableDevelopers();
}

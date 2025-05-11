package com.web.soft.services;

import com.web.soft.mappers.SoftCoreMapper;
import com.web.soft.repos.DeveloperRepository;
import com.web.soft.response.DeveloperDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    private final DeveloperRepository developerRepository;

    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    public List<DeveloperDTO> getAllAvailableDevelopers() {
        return developerRepository.findAll().stream()
                .map(SoftCoreMapper::toDto)
                .collect(Collectors.toList());
    }
}

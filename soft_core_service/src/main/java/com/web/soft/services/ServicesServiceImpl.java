package com.web.soft.services;

import com.web.soft.mappers.SoftCoreMapper;
import com.web.soft.repos.ServiceRepository;
import com.web.soft.response.ServiceDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicesServiceImpl implements ServicesService {

    private final ServiceRepository serviceRepository;

    public ServicesServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<ServiceDTO> getAllServiceDTOs() {
        return serviceRepository.findAll().stream()
                .map(SoftCoreMapper::toDto)
                .collect(Collectors.toList());
    }

}

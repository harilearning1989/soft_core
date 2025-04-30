package com.web.soft.mappers;

import com.web.soft.models.Services;
import com.web.soft.response.ServiceDTO;

public class ServiceMapper {
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
}


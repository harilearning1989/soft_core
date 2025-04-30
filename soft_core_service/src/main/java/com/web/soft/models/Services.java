package com.web.soft.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "SERVICES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICE_ID")
    private Long serviceId;
    @Column(name = "ICON")
    private String icon;
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    @Column(name = "DESCRIPTION", length = 1000)
    private String description;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

}


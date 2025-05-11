package com.web.soft.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DEVELOPERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FULL_NAME", length = 100)
    private String fullName;

    @Column(length = 100)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 15)
    private String phoneNumber;

    private String skills;

    @Column(name = "EXPERIENCE_YEARS")
    private Integer experienceYears;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @Column(name = "PHOTO_URL", columnDefinition = "TEXT")
    private String photoUrl;

    @Lob
    private byte[] photo;

}


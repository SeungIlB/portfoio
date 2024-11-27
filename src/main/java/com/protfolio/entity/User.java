package com.protfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private LocalDate age;

    private String collage;

    private String phoneNumber;

    private String gender;

    private String introduce;

    private String desiredJob;

    private String githubUrl;

    private String velogUrl;
}

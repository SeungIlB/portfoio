package com.protfolio.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
public class UserDTO {

    @Column
    private String name;

    @Column
    private LocalDate age;

    @Column
    private String collage;

    @Column
    private String phoneNumber;

    @Column
    private String gender;

    @Column
    private String introduce;

    @Column
    private String desiredJob;

    @Column
    private String githubUrl;

    @Column
    private String velogUrl;
}

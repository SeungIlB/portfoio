package com.protfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class SkillAndStack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String content;
}

package com.protfolio.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String companyName;

    @Column
    private String position;

    @Column
    private String content;

    @Column
    private String period;

    @Column
    private boolean related;
}

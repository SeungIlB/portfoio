package com.protfolio.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@RequiredArgsConstructor
@Getter
@Setter
public class PortfolioDTO {

    private String title;

    private String contents;

    private LocalDate startDate;

    private LocalDate endDate;

    private boolean inProgress;
}

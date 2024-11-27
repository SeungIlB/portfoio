package com.protfolio.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CareerDTO {

    private String companyName;

    private String position;

    private String content;

    private String period;

    private boolean related;
}

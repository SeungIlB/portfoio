package com.protfolio.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ActivityDTO {
    private String name;

    private String content;

    private String period;
}

package com.careerhub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobRequestDto {

    private String title;
    private String description;
    private String location;
    private Double salary;
    private String skills;
    private Integer experience;
    private Long companyId;
}
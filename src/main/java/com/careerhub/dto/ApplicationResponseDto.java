package com.careerhub.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationResponseDto {

    private Long id;
    private String candidateName;
    private String jobTitle;
    private String status;
}
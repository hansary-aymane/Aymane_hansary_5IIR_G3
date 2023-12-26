package com.example.aymane_hansary_5iir_g3.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class ComputerDTO {
    private String proce;
    private Integer ram;
    private String hardDrive;
    private Float price;
    private String macAddress;
}
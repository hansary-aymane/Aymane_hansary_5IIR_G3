package com.example.aymane_hansary_5iir_g3.doa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Pc;
    private String proce;
    private Integer ram;
    private String hardDrive;
    private Float price;
    private String macAddress;
}

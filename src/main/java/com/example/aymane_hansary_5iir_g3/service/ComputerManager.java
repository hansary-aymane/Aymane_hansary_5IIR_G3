package com.example.aymane_hansary_5iir_g3.service;

import com.example.aymane_hansary_5iir_g3.service.dtos.ComputerDTO;

public interface ComputerManager {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);
    public ComputerDTO deleteComputer(Long id);

    public ComputerDTO getComputerByPrice(Float price);
    public ComputerDTO getComputerByProce(String proce);
}

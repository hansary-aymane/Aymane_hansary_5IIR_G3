package com.example.aymane_hansary_5iir_g3.service;

import com.example.aymane_hansary_5iir_g3.service.dtos.ComputerDTO;

import java.util.List;

public interface ComputerManager {
    public ComputerDTO saveComputer(ComputerDTO computerDTO);

    public ComputerDTO deleteComputer(Long id);

            // getComputerByPrice(price:Float):[ComputerDTO]
    public List<ComputerDTO> getComputerByPrice(Float price);

            // getComputerByProce(proce:String):[ComputerDTO]
    public List<ComputerDTO> getComputerByProce(String proce);
}

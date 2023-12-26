package com.example.aymane_hansary_5iir_g3.service;

import com.example.aymane_hansary_5iir_g3.doa.entities.Computer;
import com.example.aymane_hansary_5iir_g3.doa.repositories.ComputerRepository;
import com.example.aymane_hansary_5iir_g3.service.dtos.ComputerDTO;
import com.example.aymane_hansary_5iir_g3.service.mappers.ComputerMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ComputerManagerAction implements ComputerManager{
    @Autowired
    public ComputerRepository computerRepository;
    @Autowired
    public ComputerMapper computerMapper;

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        // Check if MacAddress already exists
        String computerMacAddress = computerDTO.getMacAddress();
        if (computerRepository.existsByMacAddress(computerMacAddress)) {
            throw new IllegalArgumentException("Computer MacAddress already exists");
        }

        //Save the new Computer
        return computerMapper.fromComputerToComputerDTO(
                computerRepository.save(
                        computerMapper.fromComputerDTOToComputer(computerDTO)
                )
        );
    }

    @Override
    public ComputerDTO deleteComputer(Long id) {
        Computer computer = computerRepository.findById(id).get();
        if(computer.getId_Pc().equals(id)){
           computerRepository.delete(computer);
        }
        return computerMapper.fromComputerToComputerDTO(computer);
    }

    @Override
    public List<ComputerDTO> getComputerByPrice(Float price) {
        List<Computer> computerList = computerRepository.findByPrice(price);
        List<ComputerDTO> computerDTOS = new ArrayList<>();

        for (Computer computer: computerList){
            computerDTOS.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computerDTOS;
    }

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        List<Computer> computerList = computerRepository.findByProce(proce);
        List<ComputerDTO> computerDTOS = new ArrayList<>();

        for (Computer computer: computerList){
            computerDTOS.add(computerMapper.fromComputerToComputerDTO(computer));
        }
        return computerDTOS;
    }
}
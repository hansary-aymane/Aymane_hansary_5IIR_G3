package com.example.aymane_hansary_5iir_g3.service;

import com.example.aymane_hansary_5iir_g3.doa.entities.Computer;
import com.example.aymane_hansary_5iir_g3.doa.repositories.ComputerRepository;
import com.example.aymane_hansary_5iir_g3.service.dtos.ComputerDTO;
import com.example.aymane_hansary_5iir_g3.service.mappers.ComputerMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.StartDocument;

@Component @RequiredArgsConstructor
public class ComputerManagerAction implements ComputerManager{
    final private ComputerRepository computerRepository;
    final private ComputerMapper computerMapper;

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
        //ComputerDTO computerDTO = computerMapper.
        return null;
    }

    @Override
    public ComputerDTO getComputerByPrice(Float price) {
        return computerMapper.fromComputerToComputerDTO(
                computerRepository.findByPrice(price).get()
        );
    }

    @Override
    public ComputerDTO getComputerByProce(String proce) {
        return null;
    }
}
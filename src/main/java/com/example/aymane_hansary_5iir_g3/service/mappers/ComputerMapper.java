package com.example.aymane_hansary_5iir_g3.service.mappers;

import com.example.aymane_hansary_5iir_g3.doa.entities.Computer;
import com.example.aymane_hansary_5iir_g3.service.dtos.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public ComputerDTO fromComputerToComputerDTO(Computer computer){
        return  modelMapper.map(computer, ComputerDTO.class );
    }

    public Computer fromComputerDTOToComputer(ComputerDTO computerDTO){
        return  modelMapper.map(computerDTO, Computer.class );
    }
}
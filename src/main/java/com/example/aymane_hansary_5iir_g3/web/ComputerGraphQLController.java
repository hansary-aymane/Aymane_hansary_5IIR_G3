package com.example.aymane_hansary_5iir_g3.web;

import com.example.aymane_hansary_5iir_g3.service.ComputerManager;
import com.example.aymane_hansary_5iir_g3.service.dtos.ComputerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ComputerGraphQLController {
    final private ComputerManager computerManager;

    @QueryMapping
    public ComputerDTO getComputerByPrice(@Argument Float price){
        return computerManager.getComputerByPrice(price);
    }

    @QueryMapping
    public ComputerDTO getComputerByProce(@Argument String proce){
        return computerManager.getComputerByProce(proce);
    }

    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDTO){
        return computerManager.saveComputer(computerDTO);
    }

    @MutationMapping
    public ComputerDTO deleteComputer(@Argument Long id){
        return computerManager.deleteComputer(id);
    }
}
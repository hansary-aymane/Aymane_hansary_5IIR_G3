package com.example.aymane_hansary_5iir_g3.doa.repositories;

import com.example.aymane_hansary_5iir_g3.doa.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public boolean existsByMacAddress(String computerMacAddress);

    public List<Computer> findByPrice(Float price);
    public List<Computer> findByProce(String proce);
}
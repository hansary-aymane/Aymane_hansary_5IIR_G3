package com.example.aymane_hansary_5iir_g3;

import com.example.aymane_hansary_5iir_g3.doa.entities.Computer;
import com.example.aymane_hansary_5iir_g3.doa.repositories.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AymaneHansary5IirG3Application {

	public static void main(String[] args) {
		SpringApplication.run(AymaneHansary5IirG3Application.class, args);
	}

	@Bean
	CommandLineRunner start(ComputerRepository computerRepository) {
		return args -> {
			List<Computer> computerList =  List.of(
					Computer.builder().proce("A").ram(4).hardDrive("aaaaaaa").price(3333F).macAddress("aa").build(),
					Computer.builder().proce("Z").ram(4).hardDrive("zzzzzzz").price(3333F).macAddress("zz").build(),
					Computer.builder().proce("x").ram(4).hardDrive("eeeeeee").price(3333F).macAddress("ee").build(),
					Computer.builder().proce("B").ram(4).hardDrive("bbbbbbb").price(3333F).macAddress("bb").build()
			);
			computerRepository.saveAll(computerList);
		};
	}
}
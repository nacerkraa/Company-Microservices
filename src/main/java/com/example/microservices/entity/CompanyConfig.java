package com.example.microservices.entity;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.microservices.dao.CompanyRepository;

@Configuration
public class CompanyConfig {
	@Bean
	CommandLineRunner commandLineRunner(CompanyRepository companyRepository) {
		return args -> {
			Company achraf = new Company(2L, "Acharaf", 13.2);
			Company ahmed = new Company(3L, "Ahmed", 1.22);
			
			companyRepository.saveAll(List.of(achraf,ahmed));
		};

	}
}

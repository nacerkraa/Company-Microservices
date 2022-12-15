package com.example.microservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.microservices.entity.Company;

@RepositoryRestResource // Pour Explore tout les Microservices
public interface CompanyRepository extends JpaRepository<Company, Long>{

}

package com.example.microservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
// Lamboc annotations
@Data // pour les getters et les setters
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Company {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increments
 	private Long id;
	private String name;
	private double price;

}

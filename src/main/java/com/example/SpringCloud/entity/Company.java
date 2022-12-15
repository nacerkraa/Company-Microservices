package com.example.SpringCloud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // for auto increments
 	private Long id;
	private String name;
	private double price;

}

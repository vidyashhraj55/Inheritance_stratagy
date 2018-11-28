package com.example.demo.models;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Animal {
    public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long animalId;
    private String species;
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
 
}
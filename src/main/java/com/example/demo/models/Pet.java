package com.example.demo.models;

import javax.persistence.Entity;

@Entity
public class Pet extends Animal {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
}
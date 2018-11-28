package com.example.demo.models;

import javax.persistence.Entity;

@Entity
public class NonPet extends Animal {

	
	 private String npname;

		public String getName() {
			return npname;
		}

		public void setName(String name) {
			this.npname = name;
		}
	 
}

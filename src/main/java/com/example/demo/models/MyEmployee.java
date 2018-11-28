package com.example.demo.models;

import javax.persistence.AttributeOverride;
import javax.persistence.Entity;
import javax.persistence.Column;

@Entity
public class MyEmployee extends Person {
    private String company; 

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
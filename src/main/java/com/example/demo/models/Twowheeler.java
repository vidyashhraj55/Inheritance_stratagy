package com.example.demo.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bike")
public class Twowheeler  extends Vehicle
{

	public Twowheeler() {
	}
	public String SteeringHandle;
	
	public String getStreeingHandle() {
		return SteeringHandle;
	}
	public void setStreeingHandle(String streeingHandle) {
		SteeringHandle = streeingHandle;
	}

}

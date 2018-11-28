package com.example.demo.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("car")
public class FourWheeler extends Vehicle{

	public FourWheeler() {
	}
	@NotNull
 public String steeringWheel;
 
public String getSteeringWheel() {
	return steeringWheel;
}
public void setSteeringWheel(String steeringWheel) {
	this.steeringWheel = steeringWheel;
}
}

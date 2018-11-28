package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Vehicle_type",discriminatorType=DiscriminatorType.STRING)
public class Vehicle {

	public Vehicle() {
	}
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long vehicleId;
    
    @NotNull
    public String vehicleName;

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}

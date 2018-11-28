package com.example.demo;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Animal;
import com.example.demo.models.FourWheeler;
import com.example.demo.models.MyEmployee;
import com.example.demo.models.NonPet;
import com.example.demo.models.Pet;
import com.example.demo.models.Twowheeler;
import com.example.demo.models.Vehicle;
import com.example.demo.repositories.AnimalRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.FourWheelerRepository;
import com.example.demo.repositories.NonRepository;
import com.example.demo.repositories.PetRepository;
import com.example.demo.repositories.TwoWheelerRepository;
import com.example.demo.repositories.VehicleRepository;

@Service
public class SampleService {

	
	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	AnimalRepository aniRepo;
	@Autowired
	PetRepository petRepo;
	@Autowired
	NonRepository nonpetRepo;
	@Autowired
	VehicleRepository vehicleRepo;
	@Autowired
	TwoWheelerRepository twoRepo;
	@Autowired
	FourWheelerRepository fourRepo;
	
	public void createPerson() {
//		Person per=new Person();
		MyEmployee emp=new MyEmployee();
		emp.setCompany("bchd");
		emp.setName("bcjs");
		emp.setPersonId(213);
		empRepo.save(emp);
		
	}
	public void createAnimal() {
		Animal animal=new Animal();
		animal.setSpecies("pet");
		aniRepo.save(animal);
		Pet pet=new Pet();
		pet.setName("sonali");
		pet.setSpecies("pomeranian");
		petRepo.save(pet);
		NonPet nonpet=new NonPet();
		nonpet.setName("lion");
		nonpet.setSpecies("Panthera leo");
		nonpetRepo.save(nonpet);
	}
	public void CreateVehicle() {
		Vehicle vehicle=new Vehicle();
		
		Twowheeler two=new Twowheeler();
		two.setVehicleName("pulsur");
		two.setStreeingHandle("bike Steering");
		twoRepo.save(two);
		FourWheeler four=new FourWheeler();
		four.setVehicleName("swift");
		four.setSteeringWheel("car steering");
		
		fourRepo.save(four);
	}
	
}

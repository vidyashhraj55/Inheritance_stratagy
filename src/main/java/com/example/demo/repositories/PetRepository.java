package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.models.Pet;


@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface PetRepository extends  CrudRepository<Pet, Long> {


}

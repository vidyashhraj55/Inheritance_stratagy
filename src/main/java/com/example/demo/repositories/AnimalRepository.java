package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.models.Animal;


@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
public interface AnimalRepository extends  CrudRepository<Animal, Long> {


}

package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.models.NonPet;


@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface NonRepository extends  CrudRepository<NonPet, Long> {


}

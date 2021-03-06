package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.models.Animal;
import com.example.demo.models.FourWheeler;


@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
public interface FourWheelerRepository extends  CrudRepository<FourWheeler, Long> {


}

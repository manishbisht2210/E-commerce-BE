package com.mani.example.ecommerce.dao;

import com.mani.example.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "countries", path ="countries")
public interface CountryRepository extends JpaRepository<Country, Integer> {
}

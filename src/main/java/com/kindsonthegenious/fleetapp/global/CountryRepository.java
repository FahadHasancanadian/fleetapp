package com.kindsonthegenious.fleetapp.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenious.fleetapp.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}

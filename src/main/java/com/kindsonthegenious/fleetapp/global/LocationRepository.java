package com.kindsonthegenious.fleetapp.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenious.fleetapp.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}

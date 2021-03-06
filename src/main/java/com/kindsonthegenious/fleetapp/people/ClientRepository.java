package com.kindsonthegenious.fleetapp.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenious.fleetapp.model.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

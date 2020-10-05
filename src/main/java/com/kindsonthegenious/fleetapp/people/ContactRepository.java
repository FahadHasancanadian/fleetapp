package com.kindsonthegenious.fleetapp.people;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenious.fleetapp.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}

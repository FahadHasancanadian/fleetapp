package com.kindsonthegenious.fleetapp.global;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenious.fleetapp.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}

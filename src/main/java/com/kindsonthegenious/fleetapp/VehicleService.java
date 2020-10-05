package com.kindsonthegenious.fleetapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Vehicle;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
  
	public List<Vehicle> findAll() {
		return vehicleRepository.findAll();
	}
	
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}
	
	public Optional<Vehicle> findById(int id){
		return vehicleRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleRepository.deleteById(id);
	}
	
}

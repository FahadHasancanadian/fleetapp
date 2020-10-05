package com.kindsonthegenious.fleetapp.vehicleparam;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.VehicleMake;

@Service
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
  
	public List<VehicleMake> findAll() {
		return vehicleMakeRepository.findAll();
	}
	
	public void save(VehicleMake country) {
		vehicleMakeRepository.save(country);
	}
	
	public Optional<VehicleMake> findById(int id){
		return vehicleMakeRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleMakeRepository.deleteById(id);
	}
	
}

package com.kindsonthegenious.fleetapp.vehicleparam;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.VehicleType;

@Service
public class VehicleTypeService {
	
	
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
  
	public List<VehicleType> findAll() {
		return vehicleTypeRepository.findAll();
	}
	
	public void save(VehicleType country) {
		vehicleTypeRepository.save(country);
	}
	
	public Optional<VehicleType> findById(int id){
		return vehicleTypeRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleTypeRepository.deleteById(id);
	}
	
}

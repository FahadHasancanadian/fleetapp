package com.kindsonthegenious.fleetapp.vehicleparam;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.VehicleStatus;

@Service
public class VehicleStatusService {
	
	@Autowired
	private VehicleStatusRepository vehicleStatusRepository;
  
	public List<VehicleStatus> findAll() {
		return vehicleStatusRepository.findAll();
	}
	
	public void save(VehicleStatus country) {
		vehicleStatusRepository.save(country);
	}
	
	public Optional<VehicleStatus> findById(int id){
		return vehicleStatusRepository.findById(id);
	}

	public void delete(Integer id) {
		vehicleStatusRepository.deleteById(id);
	}
	
}

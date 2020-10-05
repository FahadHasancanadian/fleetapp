package com.kindsonthegenious.fleetapp.global;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Country;
import com.kindsonthegenious.fleetapp.model.Location;

@Service()  
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;
  
	public List<Location> findAll() {
		return locationRepository.findAll();
	}
	
	public void save(Location country) {
		locationRepository.save(country);
	}
	
	public Optional<Location> findById(int id){
		return locationRepository.findById(id);
	}

	public void delete(Integer id) {
		locationRepository.deleteById(id);
	}
}

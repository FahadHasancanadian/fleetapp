package com.kindsonthegenious.fleetapp.global;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Country;

@Service()  
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
  
	public List<Country> findAll() {
		return countryRepository.findAll();
	}
	
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(int id){
		return countryRepository.findById(id);
	}

	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}
}

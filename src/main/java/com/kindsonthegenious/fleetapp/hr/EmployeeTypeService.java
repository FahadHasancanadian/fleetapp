package com.kindsonthegenious.fleetapp.hr;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.EmployeeType;

@Service
public class EmployeeTypeService {
	
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
  
	public List<EmployeeType> findAll() {
		return employeeTypeRepository.findAll();
	}
	
	public void save(EmployeeType country) {
		employeeTypeRepository.save(country);
	}
	
	public Optional<EmployeeType> findById(int id){
		return employeeTypeRepository.findById(id);
	}

	public void delete(Integer id) {
		employeeTypeRepository.deleteById(id);
	}
	
}

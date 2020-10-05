package com.kindsonthegenious.fleetapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Employee;

@Service
public class EmployeeService {
		
	@Autowired
	private EmployeeRepository employeeRepository;
  
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public Optional<Employee> findById(int id){
		return employeeRepository.findById(id);
	}

	public void delete(Integer id) {
		employeeRepository.deleteById(id);
	}
	
}

package com.kindsonthegenious.fleetapp.people;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Supplier;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;
  
	public List<Supplier> findAll() {
		return supplierRepository.findAll();
	}
	
	public void save(Supplier supplier) {
		supplierRepository.save(supplier);
	}
	
	public Optional<Supplier> findById(int id){
		return supplierRepository.findById(id);
	}

	public void delete(Integer id) {
		supplierRepository.deleteById(id);
	}
	
}

package com.kindsonthegenious.fleetapp.account;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.InvoiceStatus;

@Service
public class InvoiceStatusService {
	
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
  
	public List<InvoiceStatus> findAll() {
		return invoiceStatusRepository.findAll();
	}
	
	public void save(InvoiceStatus country) {
		invoiceStatusRepository.save(country);
	}
	
	public Optional<InvoiceStatus> findById(int id){
		return invoiceStatusRepository.findById(id);
	}

	public void delete(Integer id) {
		invoiceStatusRepository.deleteById(id);
	}
	
	
}

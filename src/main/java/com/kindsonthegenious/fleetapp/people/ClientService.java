package com.kindsonthegenious.fleetapp.people;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Client;

@Service
public class ClientService {
	
	
	@Autowired
	private ClientRepository clientRepository;
  
	public List<Client> findAll() {
		return clientRepository.findAll();
	}
	
	public void save(Client client) {
		clientRepository.save(client);
	}
	
	public Optional<Client> findById(int id){
		return clientRepository.findById(id);
	}

	public void delete(Integer id) {
		clientRepository.deleteById(id);
	}
	
	
}

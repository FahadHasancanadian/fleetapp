package com.kindsonthegenious.fleetapp.people;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
  
	public List<Contact> findAll() {
		return contactRepository.findAll();
	}
	
	public void save(Contact contact) {
		contactRepository.save(contact);
	}
	
	public Optional<Contact> findById(int id){
		return contactRepository.findById(id);
	}

	public void delete(Integer id) {
		contactRepository.deleteById(id);
	}
	
}

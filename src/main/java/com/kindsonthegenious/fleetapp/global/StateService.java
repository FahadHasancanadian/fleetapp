package com.kindsonthegenious.fleetapp.global;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.State;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
  
	public List<State> findAll() {
		return stateRepository.findAll();
	}
	
	public void save(State state) {
		stateRepository.save(state);
	}
	
	public Optional<State> findById(int id){
		return stateRepository.findById(id);
	}

	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
}

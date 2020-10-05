package com.kindsonthegenious.fleetapp.hr;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.JobTitle;

@Service
public class JobTitleService {

	@Autowired
	private JobTitleRepository jobTitleRepository;
  
	public List<JobTitle> findAll() {
		return jobTitleRepository.findAll();
	}
	
	public void save(JobTitle country) {
		jobTitleRepository.save(country);
	}
	
	public Optional<JobTitle> findById(int id){
		return jobTitleRepository.findById(id);
	}

	public void delete(Integer id) {
		jobTitleRepository.deleteById(id);
	}
	
}

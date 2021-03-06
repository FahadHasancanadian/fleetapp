package com.kindsonthegenious.fleetapp.global;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenious.fleetapp.model.Country;
import com.kindsonthegenious.fleetapp.model.Location;
import com.kindsonthegenious.fleetapp.model.State;

@Controller
public class LocationController {
	
	@Autowired 
	private LocationService locationService;
	
	@Autowired 
	private CountryService countryService;
	
	@Autowired 
	private StateService stateService;
	
	@GetMapping("/locations")
	public String findAll(Model model){	
		List<Country> countryList = countryService.findAll();
		List<Location> locationList = locationService.findAll();
		List<State> stateList = stateService.findAll();
		
		model.addAttribute("countries", countryList);
		model.addAttribute("locations", locationList);
		model.addAttribute("states", stateList);
		
		return "location";
	}
	
	@PostMapping("locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	
	@RequestMapping("locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id){
		return locationService.findById(id);
	}
	
	@RequestMapping(value = "/locations/update", method = {RequestMethod.PUT , RequestMethod.GET})
	public String update(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
	
	@RequestMapping(value = "/locations/delete", method = {RequestMethod.DELETE , RequestMethod.GET})
	public String delete(Integer id) {
		locationService.delete(id);
		return "redirect:/locations";
	}

}

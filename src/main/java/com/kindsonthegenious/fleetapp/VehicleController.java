package com.kindsonthegenious.fleetapp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenious.fleetapp.global.LocationService;
import com.kindsonthegenious.fleetapp.model.Vehicle;
import com.kindsonthegenious.fleetapp.vehicleparam.VehicleMakeService;
import com.kindsonthegenious.fleetapp.vehicleparam.VehicleModelService;
import com.kindsonthegenious.fleetapp.vehicleparam.VehicleStatusService;
import com.kindsonthegenious.fleetapp.vehicleparam.VehicleTypeService;

@Controller
public class VehicleController {
	
	
	@Autowired private VehicleService vehicleService;
	@Autowired private LocationService locationService;	
	@Autowired private EmployeeService employeeService;	
	@Autowired private VehicleMakeService vehicleMakeService;	
	@Autowired private VehicleStatusService vehicleStatusService;
	@Autowired private VehicleTypeService vehicleTypeService;
	@Autowired private VehicleModelService vehicleModelService;
	
	
	@GetMapping("/vehicles")
	public String findAll(Model model){	
		
		
		model.addAttribute("vehicles", vehicleService.findAll());	
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("employees", employeeService.findAll());
		model.addAttribute("vehicleMakes", vehicleMakeService.findAll());
		model.addAttribute("vehicleStatuses", vehicleStatusService.findAll());
		model.addAttribute("vehicleTypes", vehicleTypeService.findAll());
		model.addAttribute("vehicleModels", vehicleModelService.findAll());

		return "vehicle";
	}
	
	@PostMapping("vehicles/addNew")
	public String addNew(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}
	
	@RequestMapping("vehicles/findById")
	@ResponseBody
	public Optional<Vehicle> findById(int id){
		return vehicleService.findById(id);
	}
	
	@RequestMapping(value = "/vehicles/update", method = {RequestMethod.PUT , RequestMethod.GET})
	public String update(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}
	
	@RequestMapping(value = "/vehicles/delete", method = {RequestMethod.DELETE , RequestMethod.GET})
	public String delete(Integer id) {
		vehicleService.delete(id);
		return "redirect:/vehicles";
	}

}

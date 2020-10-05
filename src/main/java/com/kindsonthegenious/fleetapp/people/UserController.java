package com.kindsonthegenious.fleetapp.people;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.kindsonthegenious.fleetapp.UserService;
import com.kindsonthegenious.fleetapp.model.User;

@Controller
public class UserController {
	
	@Autowired private UserService userService;
	
	@GetMapping("/users")
	public String getCountries() {
		return "user";
	}
	
	@PostMapping(value="users/addNew")
	public RedirectView addNew(User user, RedirectAttributes redir) {
		userService.save(user);	
		RedirectView  redirectView= new RedirectView("/login",true);
	        redir.addFlashAttribute("message",
	    		"You successfully registered! You can now login");
	    return redirectView;				
	}

}

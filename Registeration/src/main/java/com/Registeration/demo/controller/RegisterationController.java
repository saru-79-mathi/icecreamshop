package com.Registeration.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Registeration.demo.model.Registeration;
import com.Registeration.demo.service.RegisterationService;

@RestController
public class RegisterationController {

	@Autowired
	RegisterationService RegisterationController;
	
	@GetMapping("fetchalldetails")
	public List<Registeration> getAllRegisteration()
	{
		List<Registeration>registerationList=RegisterationController.getAllRegisteration();
		return registerationList;
	}
	@PostMapping("savealldetails")
	public Registeration saveRegisteration(@RequestBody Registeration r ) {
		return RegisterationController.saveRegisteration(r);
	}
	@GetMapping("/login")
	
		public String logins(@RequestParam String firstname, @RequestParam String password)
		{
		  return RegisterationController.login(firstname,password);
		}
		
	
}

package sms.backend.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sms.backend.home.model.Citizen;
import sms.backend.home.repository.ElectionRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	ElectionRepository repo;
	
	@RequestMapping(value = "/getCitizens",method = RequestMethod.GET)
	public List<Citizen> returnHello()
	{
		 List<Citizen> citizen = repo.findAll();
		return citizen;
	}
	
	
	@PostMapping(value="/election",consumes = "application/json", produces = "application/json")
	public Citizen setElection(@RequestBody Citizen election)
	{
		Citizen a = repo.save(election);
		return a;
	}
	

}

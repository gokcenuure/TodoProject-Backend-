package com.example.TodoProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoProject.business.abstracts.AdministrationService;

@RestController
@RequestMapping("/api/administration")
public class AdministrationsController {
	private  AdministrationService administrationService;

	@Autowired
	public AdministrationsController(AdministrationService administrationService) {
		this.administrationService = administrationService;
	} 
}

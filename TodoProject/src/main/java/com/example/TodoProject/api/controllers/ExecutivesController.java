package com.example.TodoProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoProject.business.abstracts.ExecutiveService;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.entities.concretes.Executive;




@RestController
@RequestMapping("/api/executives")
public class ExecutivesController {

	private ExecutiveService executiveService;
	

	@Autowired
	public ExecutivesController(ExecutiveService executiveService) {
		this.executiveService=executiveService;
	} 
	@GetMapping("/getall")
	public DataResult<List<Executive>> getAll() {
		return executiveService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Executive executive) {
		return this.executiveService.add(executive);
		}
	@PostMapping("/found")
	public Result found(@RequestParam int id) {
		return this.executiveService.found(id);
	}
}

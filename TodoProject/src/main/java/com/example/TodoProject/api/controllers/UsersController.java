package com.example.TodoProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoProject.business.abstracts.UserService;
import com.example.TodoProject.core.concretes.User;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;

@RestController
@RequestMapping("/api/users")
public class UsersController {

	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService=userService;
	} 
	@GetMapping("/getall")
	public DataResult<List<User>> getAll() {
		return userService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
	}
	@PostMapping("/found")
	public Result found(@RequestParam int id) {
		return this.userService.found(id);
	}
	@PostMapping("/update")
	public Result update(@RequestBody User user) {
		return this.userService.update(user);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody User user) {
		return this.userService.delete(user);	}
	

}

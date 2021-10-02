 package com.example.TodoProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoProject.business.abstracts.TodoService;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.entities.concretes.Todo;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin


public class TodosController {

	private TodoService todoService;
	
	@Autowired
	public TodosController(TodoService todoService) {
		super();
		this.todoService=todoService;
	} 
	@GetMapping("/getall")
	public DataResult<List<Todo>> getAll() {
		return todoService.getAll();
	}
	
	@PostMapping("/add")
	public Result create(@RequestBody Todo todo) {
		return this.todoService.create(todo);
	}

	@PostMapping("/read")
	public Result read(int id) {
		return this.todoService.getById(id);
	}

	@PostMapping("/update")
	public Result update(Todo todo) {
		return this.todoService.update(todo);
	}

	@PostMapping("/delete")
	public Result delete(int id) {
		return this.todoService.delete(id);
	}
	@GetMapping("/getByTodoName")
	public DataResult<Todo> getByTodoName(@RequestParam String todoName) {
		return this.todoService.getByTodoName(todoName);
	}


	
	


}

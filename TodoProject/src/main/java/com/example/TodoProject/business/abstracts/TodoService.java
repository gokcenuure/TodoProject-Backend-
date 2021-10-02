package com.example.TodoProject.business.abstracts;

import java.util.List;

import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.entities.concretes.Todo;

public interface TodoService {

	
	DataResult<Todo> getById(int todoId);	
    DataResult<Todo> getByTodoName(String todoName);
	Result create(Todo todo);
	Result update(Todo todo);
	Result delete(int todoId);
	DataResult<List<Todo>> getAll();
	DataResult<List<Todo>> getAllAppointedTrue();
	DataResult<List<Todo>> getAllAppointedFalse();
    DataResult<List<Todo>> getAllCompletedTrue();
    DataResult<List<Todo>> getAllCompletedFalse();

	
}
	
	
	


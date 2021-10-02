 package com.example.TodoProject.business.concretes;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.TodoProject.business.abstracts.TodoService;
import com.example.TodoProject.business.constants.Messages;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.core.utilities.results.SuccessDataResult;
import com.example.TodoProject.core.utilities.results.SuccessResult;
import com.example.TodoProject.dataAccess.abstracts.TodoDao;
import com.example.TodoProject.entities.concretes.Todo;



@Service
public class TodoManager implements TodoService{
	
	private TodoDao todoDao;
	
	
	@Autowired
	public TodoManager(TodoDao todoDao) {
		this.todoDao = todoDao;
	}

	
	@Override
	public Result create(Todo todo) {
		todoDao.save(todo);
		return new SuccessResult(Messages.TodoCreated);
	}


	@Override
	public Result update(Todo todo) {
		Todo todoOld = this.todoDao.findById(todo.getTodoId()).orElse(null);
		todoOld.setTodoName(todo.getTodoName());
		todoDao.save(todo);
		return new SuccessResult(Messages.TodoUpdated);
	}

	@Override
	public Result delete(int id) {
		Todo todo = this.todoDao.findById(id).orElse(null);
		todoDao.delete(todo);
		return new SuccessResult(Messages.TodoDeleted);
	}

	@Override
	public DataResult<List<Todo>> getAll() {
		return new SuccessDataResult<List<Todo>>(this.todoDao.findAll(),Messages.TodoListed);
	}




	@Override
	public DataResult<Todo> getById(int id) {
		return new SuccessDataResult<Todo>(this.todoDao.getById(id), Messages.TodoFound);
	}


	@Override
	public SuccessDataResult<List<Todo>> getAllAppointedTrue() {
		return null;
		//return new SuccessDataResult<List<Todo>>(this.todoDao.getAllAppointedTrue(), Messages.AppointedTodosListed);
	}

	@Override
	public DataResult<List<Todo>> getAllAppointedFalse() {
		return null;
		//return new SuccessDataResult<List<Todo>>(this.todoDao.getAllAppointedFalse(), Messages.UnappointedTodosListed);
	}

	@Override
	public DataResult<List<Todo>> getAllCompletedTrue() {
		return null;

		//return new SuccessDataResult<List<Todo>>(this.todoDao.getAllCompletedTrue(), Messages.CompletedTodosListed);
	}

	@Override
	public DataResult<List<Todo>> getAllCompletedFalse() {
		return null;
		//return new SuccessDataResult<List<Todo>>(this.todoDao.getAllCompletedFalse(), Messages.UncompletedTodosListed);
	}


	@Override
	public DataResult<Todo> getByTodoName(String todoName) {
		return new SuccessDataResult<Todo>(this.todoDao.getByTodoName(todoName), Messages.TodoListed);
	}






}

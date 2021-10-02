package com.example.TodoProject.business.concretes;

import org.springframework.stereotype.Service;

import com.example.TodoProject.business.abstracts.AdministrationService;
import com.example.TodoProject.business.constants.Messages;
import com.example.TodoProject.core.concretes.User;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.core.utilities.results.SuccessDataResult;
import com.example.TodoProject.entities.concretes.Todo;

@Service
public class AdministrationManager implements AdministrationService{

	@Override
	public Result MakeUserEmployee(String email, String position) {
		return new SuccessDataResult<User>(Messages.UserMadeEmployee);
	}

	@Override
	public Result MakeUserExecutive(String email) {
		return new SuccessDataResult<User>(Messages.UserMadeExecutive);
	}

	@Override
	public Result TodoAppointed(int todoId, int employeesId) {
		return new SuccessDataResult<Todo>(Messages.TodoAppointed);
	}

}

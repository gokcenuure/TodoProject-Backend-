package com.example.TodoProject.business.abstracts;

import java.util.List;

import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.entities.concretes.Employees;

public interface EmployeesService {

	Result add(Employees employees);
	Result found(int id);
	
	DataResult<Employees> getById(int id);
	

	DataResult<List<Employees>> getAll();
}

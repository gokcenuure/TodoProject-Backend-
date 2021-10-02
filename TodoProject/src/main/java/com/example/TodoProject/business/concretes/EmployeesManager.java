package com.example.TodoProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TodoProject.business.abstracts.EmployeesService;
import com.example.TodoProject.business.constants.Messages;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.core.utilities.results.SuccessDataResult;
import com.example.TodoProject.core.utilities.results.SuccessResult;
import com.example.TodoProject.dataAccess.abstracts.EmployeesDao;
import com.example.TodoProject.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService{

	private EmployeesDao employeesDao;
	
	
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao = employeesDao;
	}

	@Override
	public Result add(Employees employees) {
		employeesDao.save(employees);
		return new SuccessResult(Messages.EmployeesAdded);
	}

	@Override
	public Result found(int id) {
		employeesDao.findById(id).orElse(null);
		return new SuccessResult(Messages.EmployeesFound);
	}

	@Override
	public DataResult<Employees> getById(int id) {
		return new SuccessDataResult<Employees>(employeesDao.getById(id), Messages.EmployeesFound);
	}



	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>(employeesDao.findAll(), Messages.EmployeesListed);
	}

}

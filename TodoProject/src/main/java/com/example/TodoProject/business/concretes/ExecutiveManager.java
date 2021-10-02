package com.example.TodoProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TodoProject.business.abstracts.ExecutiveService;
import com.example.TodoProject.business.constants.Messages;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.core.utilities.results.SuccessDataResult;
import com.example.TodoProject.core.utilities.results.SuccessResult;
import com.example.TodoProject.dataAccess.abstracts.ExecutiveDao;
import com.example.TodoProject.entities.concretes.Executive;

@Service
public class ExecutiveManager implements ExecutiveService{

	
	private ExecutiveDao executiveDao;
	
	
	public ExecutiveManager(ExecutiveDao executiveDao) {
		this.executiveDao = executiveDao;
	}

	@Override
	public DataResult<Executive> getById(int executiveId) {
		return new SuccessDataResult<Executive>(executiveDao.getById(executiveId) , Messages.ExecutiveFound);
	}

	@Override
	public DataResult<Executive> getByUserId(int userId) {
		return new SuccessDataResult<Executive>(executiveDao.getByUserId(userId) , Messages.ExecutiveFound);
	}

	@Override
	public DataResult<List<Executive>> getAll() {
		return new SuccessDataResult<List<Executive>>(executiveDao.findAll(), Messages.ExecutiveListed);
	}

	@Override
	public Result add(Executive executive) {
		executiveDao.save(executive);
		return new SuccessResult(Messages.ExecutiveAdded);
	}

	@Override
	public Result found(int id) {
		executiveDao.findById(id).orElse(null);
		return new SuccessResult(Messages.ExecutiveFound);
	}

}

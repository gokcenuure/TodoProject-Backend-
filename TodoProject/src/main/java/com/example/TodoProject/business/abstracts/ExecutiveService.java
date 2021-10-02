package com.example.TodoProject.business.abstracts;

import java.util.List;

import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.entities.concretes.Executive;

public interface ExecutiveService {

	DataResult<Executive> getById(int executiveId);
	DataResult<Executive> getByUserId(int userId);
	
    DataResult<List<Executive>> getAll();
    
    Result add(Executive executive);
    Result found(int id);
    
}

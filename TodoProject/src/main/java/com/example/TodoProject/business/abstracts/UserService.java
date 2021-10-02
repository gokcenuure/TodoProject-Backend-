package com.example.TodoProject.business.abstracts;

import java.util.List;


import com.example.TodoProject.core.concretes.User;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;

public interface UserService {

	
	DataResult<User> getById(int userId);
	
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	
	
	Result add(User user);
	Result found(int id);
	Result update(User user);
	Result delete(User user);

	
	
}

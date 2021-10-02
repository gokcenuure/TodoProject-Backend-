package com.example.TodoProject.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TodoProject.business.abstracts.UserService;
import com.example.TodoProject.business.constants.Messages;
import com.example.TodoProject.core.concretes.User;
import com.example.TodoProject.core.utilities.results.DataResult;
import com.example.TodoProject.core.utilities.results.Result;
import com.example.TodoProject.core.utilities.results.SuccessDataResult;
import com.example.TodoProject.core.utilities.results.SuccessResult;
import com.example.TodoProject.dataAccess.abstracts.UserDao;

@Service

public class UserManager implements UserService{

	
	private UserDao userDao;
	
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
	}
	
	@Override
	public DataResult<User> getById(int userId) {
		return new SuccessDataResult<User>(userDao.getById(userId), Messages.UserFound);
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(userDao.getByEmail(email), Messages.UserFound);
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(this.userDao.findAll(), Messages.UserOperationsListed);
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult(Messages.UserAdded);
	}

	@Override
	public Result found(int id) {
		userDao.findById(id).orElse(null);
		return new SuccessResult(Messages.UserFound);
	}

	@Override
	public Result update(User user) {
		User userOld = this.userDao.findById(user.getUserId()).orElse(null);
		userOld.setFirstName(user.getFirstName());
		userOld.setLastName(user.getLastName());
		userOld.setEmail(user.getEmail());
		
		userDao.save(user);
		return new SuccessResult(Messages.UserUpdated);
	}

	@Override
	public Result delete(User user) {
		userDao.delete(user);
		return new SuccessResult(Messages.UserDeleted);
	}

}

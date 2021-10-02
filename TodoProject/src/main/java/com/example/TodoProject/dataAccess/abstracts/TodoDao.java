package com.example.TodoProject.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoProject.entities.concretes.Todo;

public interface TodoDao extends JpaRepository<Todo,Integer>{
 
	Todo getByTodoId(Integer todoId);
	Todo getByTodoName(String todoName);	
	
//
//	List<Todo> getAllByExecutiveId(Integer id);
//	List<Todo> getAllisAppointedTrue();
//	List<Todo> getAllisAppointedFalse();
//	List<Todo> getAllisCompletedTrue();
//	List<Todo> getAllisCompletedFalse();
	

	
	
	
}

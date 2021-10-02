package com.example.TodoProject.dataAccess.abstracts;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TodoProject.core.concretes.User;


public interface UserDao extends JpaRepository<User,Integer> {
	
	User getByEmail(String email);
	
}

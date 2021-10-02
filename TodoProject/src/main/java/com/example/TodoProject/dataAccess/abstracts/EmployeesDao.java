package com.example.TodoProject.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.TodoProject.entities.concretes.Employees;


public interface EmployeesDao extends JpaRepository<Employees, Integer>{

}

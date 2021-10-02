 package com.example.TodoProject.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.TodoProject.core.concretes.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="todos")
@AllArgsConstructor
@NoArgsConstructor

public class Todo {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="todo_id")
	@JsonIgnore
	private int todoId;
	
	@Column(name="todo_name")
    private String todoName;
	
	@Column(name="definition")
    private String definition;
	
	@Column(name="executive_id")
    private int executiveId;
	
	@Column(name="employees_id")
	private int employeesId;
	
	@Column(name="creation_date")
	@JsonIgnore
    private Date creationDate;  
	
	@Column(name="appointment_date")
    private Date appointmentDate;
	
	@Column(name="appointed")
    private boolean appointed;
	
	@Column(name="completed")
    private boolean completed = false;
	

}

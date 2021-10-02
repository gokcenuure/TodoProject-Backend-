package com.example.TodoProject.core.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "todos"})
@DynamicUpdate
public class User {
    
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
	@Column(name="user_id")
	public int userId;
	
	@Column(name="first_name")
    public String firstName;
	
	@Column(name="last_name")
    public String lastName;
	
	@Column(name="email")
	public String email;
	
	@Column(name="password")
	public String password; 
	
	@Column(name="position")
	public String position;
	
	@Column(name="appointed")
	public boolean appointed;

}

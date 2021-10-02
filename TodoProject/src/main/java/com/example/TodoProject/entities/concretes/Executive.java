package com.example.TodoProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.example.TodoProject.core.concretes.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="executives")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id" , referencedColumnName = "user_id")
public class Executive extends User {

	
    @Column(name = "company_name")
    private String companyName;
}

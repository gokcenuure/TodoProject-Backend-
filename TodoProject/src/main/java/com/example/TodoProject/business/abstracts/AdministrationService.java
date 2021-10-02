package com.example.TodoProject.business.abstracts;

import com.example.TodoProject.core.utilities.results.Result;

public interface AdministrationService {

	
	Result MakeUserEmployee(String email, String position);
	Result MakeUserExecutive(String email);
	Result TodoAppointed(int todoId, int employeesId);
}

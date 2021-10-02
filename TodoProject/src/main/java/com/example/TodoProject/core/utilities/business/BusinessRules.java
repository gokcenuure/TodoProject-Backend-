package com.example.TodoProject.core.utilities.business;

import com.example.TodoProject.core.utilities.results.Result;

public class BusinessRules {


	public static Result Run(Result...logics){
        for (var logic:logics
             ) {
            if (!logic.isSuccess()){
                return logic;
            }
        }
        return null;
    }
}

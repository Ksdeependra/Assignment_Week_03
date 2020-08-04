package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.beans.Employee;

public class DaoImp implements Idao {
	
	List<Employee> employees=new ArrayList<Employee>();

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
		System.out.println("Employee is created");
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}
 
	}
	



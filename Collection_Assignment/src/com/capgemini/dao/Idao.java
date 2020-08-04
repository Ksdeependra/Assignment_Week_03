package com.capgemini.dao;

import java.util.List;

import com.capgemini.beans.Employee;

public interface Idao { 
	public void createEmployee(Employee employee);
	public List<Employee> getEmployees();

}

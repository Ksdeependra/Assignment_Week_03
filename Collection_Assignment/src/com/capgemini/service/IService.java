package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.beans.Employee;

public interface IService {
	public boolean validateEmpId(String employeeId);
	public boolean validateSalary(double sal);
	public boolean validateName(String name);
	public boolean vaidateJoinDate(LocalDate date);
	
	public void createEmployee(Employee employee);
	public List<Employee> getEmployees();

}

package com.capgemini.service;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.beans.Employee;
import com.capgemini.dao.DaoImp;
import com.capgemini.dao.Idao;

public class IServiceImpl implements IService {
	Idao dao=new DaoImp();
	
	@Override
	public boolean validateEmpId(String employeeId) {
		// TODO Auto-generated method stub
		String regex = "^[0-9]{5}_[A-Z]{2}$";
		return employeeId.matches(regex);
	}

	@Override
	public boolean validateSalary(double sal) {
		// TODO Auto-generated method stub
		return (sal>=20000 && sal<= 500000);
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		return name.matches("^[A-Za-z]{3,}$");
	}

	@Override
	public boolean vaidateJoinDate(LocalDate date) {
		// TODO Auto-generated method stub
		int flag = date.compareTo(LocalDate.now());
		return (flag>=0);
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.createEmployee(employee);
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

}

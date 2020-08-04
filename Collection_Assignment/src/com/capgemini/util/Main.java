package com.capgemini.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.capgemini.beans.Address;
import com.capgemini.beans.Department;
import com.capgemini.beans.Employee;
import com.capgemini.service.IService;
import com.capgemini.service.IServiceImpl;

public class Main {
	public static void main(String[] args) {
		IService iService=new IServiceImpl();
		Employee employee=null;
		Department department=null;
		List<Address> address = null;
		Scanner sc = new Scanner(System.in); 
		while(true) {
			  System.out.println("");
	          System.out.println("");
	          System.out.println("Select an option and enter");
				System.out.println("1. Save Unique Employee");
				System.out.println("2. Sort ByEmployee ID");
				System.out.println("3. Sort ByFirst Name");
				System.out.println("4. Sort ByLast Name");
				System.out.println("5. Sort BySalary");
				System.out.println("6. Sort ByAddress");
				System.out.println("7. Sort ByDepartment");
				System.out.println("8. Exit");
				System.out.println("_______________________________");
				switch (sc.nextInt()) {
				case 1:System.out.println("Enter First Employee");
				       System.out.println("Enter Employee Id(32476_FS): ");
				        String emoloyeeId=sc.next();
				        if(iService.validateEmpId(emoloyeeId)) {
				        	employee = new Employee();
							employee.setEmployeeId(emoloyeeId);
						}else {
							System.out.println("Invalid employee Id format");
							break;
						}
				        
				        
				case 2:System.out.println("Employee Id in ascending order :");
				Comparator<Employee> Id = new Comparator<Employee>() {
					
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getEmployeeId().compareTo(e2.getEmployeeId());
					}
				};
				Collections.sort(iService.getEmployees(),Id);
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				break;
				
				
				case 3:System.out.println(" Employee First Name in ascending order :");
				Comparator<Employee> sortByName = new Comparator<Employee>() {
					
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
					}
				};
				Collections.sort(iService.getEmployees(),sortByName);
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				break;
				
				case 4:System.out.println(" Employee Last Name in ascending order :");
				Comparator<Employee> sortByLastName = new Comparator<Employee>() {
					
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getLastName().compareToIgnoreCase(e2.getLastName());
					}
				};
				Collections.sort(iService.getEmployees(),sortByLastName);
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				break;
				
				case 5:System.out.println("Sort By Salary in descending order : ");
				Comparator<Employee> sortBySal = new Comparator<Employee>() {
					public int compare(Employee e1, Employee e2) {
						if(e1.getSalary()<e2.getSalary())
							return 1;
						else if(e1.getSalary()>e2.getSalary())
							return -1;
						else
							return 0;
					}
				};
				Collections.sort(iService.getEmployees(), sortBySal);
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				break;
				
				case 6: System.out.println("Sort By Address : ");
				for(Employee e : iService.getEmployees()) {
					Collections.sort(  e.getAddress(),new Comparator<Address>(){
						public int compare(Address add1,Address add2) {
							return add1.getAddressId()-add2.getAddressId();
						}
					} 
					);
				}
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				break;
				
				case 7:System.out.println(" Department Id in ascending order :");
				Comparator<Employee> sortByDeptId = new Comparator<Employee>() {
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getDepartment().getDeptId()-e2.getDepartment().getDeptId();
					}
				};
				Collections.sort(iService.getEmployees(), sortByDeptId);
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				
				System.out.println(" Department Name in ascending order :");
				Comparator<Employee> sortByDeptName = new Comparator<Employee>() {
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getDepartment().getDeptName().compareToIgnoreCase(e2.getDepartment().getDeptName());
					}
				};
				Collections.sort(iService.getEmployees(), sortByDeptName);
				for(Employee emp : iService.getEmployees())
					System.out.println(emp);
				break;
				
				case 8:System.out.println("Thanks??");
				break;
				
							
				       

				}
				
	          
		
	}
 }
}


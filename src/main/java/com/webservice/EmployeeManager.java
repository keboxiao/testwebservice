package com.webservice;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface EmployeeManager {

	public void addEmployee(Employee employee);
	
	public List<Employee> query();

}

package com.webservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerImpl implements EmployeeManager {

	private List<Employee> emp = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		emp.add(employee);
	}

	@Override
	public List<Employee> query() {
		// TODO Auto-generated method stub
		return emp;
	}

}

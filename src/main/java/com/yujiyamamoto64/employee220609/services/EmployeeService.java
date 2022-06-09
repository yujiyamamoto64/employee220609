package com.yujiyamamoto64.employee220609.services;

import java.util.List;

import com.yujiyamamoto64.employee220609.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	
}

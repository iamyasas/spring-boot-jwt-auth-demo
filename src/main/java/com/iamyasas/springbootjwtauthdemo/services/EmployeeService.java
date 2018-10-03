package com.iamyasas.springbootjwtauthdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.iamyasas.springbootjwtauthdemo.mappers.EmployeeMapper;
import com.iamyasas.springbootjwtauthdemo.models.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeMapper mapper;
	
	public Employee[] getEmployees(String name) {
		
		String loggedInUser = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return mapper.getEmployees(name);
	}

	public Employee getEmployee(int employeeID) {
		return mapper.getEmployee(employeeID);
	}

}

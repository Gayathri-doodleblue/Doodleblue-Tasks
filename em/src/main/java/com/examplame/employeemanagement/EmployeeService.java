package com.examplame.employeemanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
	
	@Autowired
	 private EmployeeRespository employeeRespository;
	  
	public Employee saveEmployee(Employee employee)
	{
		return employeeRespository.save(employee);
	}
	public List<Employee> saveEmployees(List<Employee> employees)
	{
		return employeeRespository.saveAll(employees);
	}
	public List<Employee> getEmployee(){
		return employeeRespository.findAll();
	}
	public Employee getEmployeeById(int id){
		return employeeRespository.findById(id).orElse(null);
	}
	public int deleteEmployee(int id)
	{
		employeeRespository.deleteById(id);
		return id;
	}
	public Employee updateEmployee(Employee employee)
	{
		Employee existingEmployee=employeeRespository.findById(employee.getId()).orElse(null);
		existingEmployee.setName(employee.getName());
		return employeeRespository.save(existingEmployee);
	}
	
	
	

}

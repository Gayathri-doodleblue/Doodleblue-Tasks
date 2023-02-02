package com.example.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.emp.customexception.ServiceException;
import com.example.emp.model.Employee;
import com.example.emp.respository.EmployeeRespository;

@Service

public class EmployeeService {

	@Autowired
	private EmployeeRespository employeeRespository;

	public Employee saveEmployee(Employee employee) {
		try {
		if(employee.getName().isEmpty())
		{
			throw new ServiceException("601","please add proper name");
		}
		
		Employee savedEmployee=employeeRespository.save(employee);
		return savedEmployee;
		}
		catch(Exception e)
		{
			throw new ServiceException("602","given employee is null");
		}
		
	}

	public List<Employee> saveEmployees(List<Employee> employees) {
		return employeeRespository.saveAll(employees);
	}
	public List<Employee> getEmployee() {
		return employeeRespository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRespository.findById(id).orElse(null);
	}		
	
	

	
		
	public Employee getEmployeeByName(String name) {
		return employeeRespository.findByName(name);
	}
//	public static List<Employee> getEmployeeNameAndID() 
//	
//		{
//		    List<Employee> employee=EmployeeRespository.getemployeeIdAndName();
//		    return employee;
//
//
//	} 
//	 
//		private List<Employee> employeeRespository(int age) {
//	// TODO Auto-generated method stub
//	return null;
//}

		public int deleteEmployee(int id) {
			
		employeeRespository.deleteById(id);
		
		return id;
					
	}

	public Employee updateEmployee(Employee employee) {
		try {
		// Employee existingEmployee =
		// employeeRespository.findById(employee.getId()).orElse(null);
		// existingEmployee.setName(employee.getName());
		return employeeRespository.save(employee);
		}catch(Exception e)
		{
			throw new ServiceException("605","something went wrong"+e.getMessage());
		}	
	}

}

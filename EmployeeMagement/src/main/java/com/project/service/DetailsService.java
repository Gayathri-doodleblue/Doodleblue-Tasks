package com.project.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.exception.ServiceException;
import com.project.model.DailyTaskTracker;
import com.project.model.Department_Info;
import com.project.model.Employee;
import com.project.model.Project_Info;
import com.project.model.UserInfo;
import com.project.repository.DailyTaskRepository;
import com.project.repository.DepartmentRepository;
import com.project.repository.EmployeeRepository;
//import com.project.repository.EmployeeRepositoryImpl;
import com.project.repository.ProjectRepository;
import com.project.repository.UserInfoRepository;

import jakarta.transaction.Transactional;

@Service
public class DetailsService
{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private  ProjectRepository projectRepository;

	public Employee saveDetails(@RequestBody Employee employee)  //save Employee,Department and Project Details
	{		
		try {
			return employeeRepository.save(employee);
			
		}
		catch (Exception e) {
			throw new ServiceException("601","Enter proper details");
		}	
	}
	
	@Transactional
    public void updateNumberOfEmployees()  //update Number of Employees in Department Entity
	{  
        departmentRepository.updateNumberOfEmployees();
    }
	

	public List<Employee> getAllDetails() // get all the Details
	{
		return employeeRepository.findAll();
	
	}

	public Employee getById(int id) //get details by employee Id 
	{
		return employeeRepository.findById(id).orElse(null);
	}
}
	 




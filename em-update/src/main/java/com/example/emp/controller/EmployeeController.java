package com.example.emp.controller;

import java.util.List;
//import java.util.logging.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.customexception.ControllerException;
import com.example.emp.customexception.ServiceException;
import com.example.emp.model.Employee;
import com.example.emp.service.EmployeeService;

@RestController

public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addEmployee")

	public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
		try {
			logger.info("Add all employee details");
			Employee saveemployee = employeeService.saveEmployee(employee);
			return new ResponseEntity<Employee>(saveemployee, HttpStatus.CREATED);
		} catch (ServiceException e) {
			ControllerException ce = new ControllerException(e.getErrorcode(), e.getErrormessage());
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			ControllerException ce = new ControllerException("606", "error");
			return new ResponseEntity<ControllerException>(ce, HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employee) {
		logger.info("Add all employee details by list");
		return employeeService.saveEmployees(employee);
	}

	@GetMapping("/employees")
	public List<Employee> findAllEmployee() {
		return employeeService.getEmployee();
	}

	@GetMapping("/employeebyid/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		logger.info("getting all details by employeeId details");
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/employeebyname/{name}")
	public Employee findEmployeeByName(@PathVariable String name) {
		logger.info("getting all details by  employeename details");
		return employeeService.getEmployeeByName(name);
	}

//	@GetMapping("/emplo")
//	public List<Employee> getEmployeeNAmeAndID() {
//	    List<Employee> employee = EmployeeService.getEmployeeNameAndID();
//	    return employee;
//	}
//	@GetMapping("/employeebyage/{age}")
//	public List<Employee> findByAge(@PathVariable int age) {
//		return employeeService.getByAge(age);
//	}
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		logger.info("update employee details");
		return employeeService.updateEmployee(employee);

	}

	@DeleteMapping("/employee/{id}")
	public int deleteEmployee(@PathVariable int id) {
		logger.info("delete employee details by Id");
		return employeeService.deleteEmployee(id);
	}
}

package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.project.model.Department_Info;
import com.project.model.Employee;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

	  

	



	}


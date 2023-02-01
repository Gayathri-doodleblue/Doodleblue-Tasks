package com.example.emp.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.model.Employee;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer>{

}

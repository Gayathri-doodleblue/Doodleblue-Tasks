package com.examplame.employeemanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer>{

}

package com.example.emp.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.emp.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

	Employee findByName(String name);

//	@Query("select s.id, s.name from emp s")
//	static
//    List<Employee> getemployeeIdAndName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Query(value="select * from Employee where age=?1 order by name")
//	public List<Employee> findbyage(int age);

}

package com.example.blibli.repository;

import com.example.blibli.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	Employee findById(String id);
	List<Employee> findByName(String name);
	@Query(value= "SELECT COUNT(1) FROM employees", nativeQuery = true) Long countTotalRecords();
}
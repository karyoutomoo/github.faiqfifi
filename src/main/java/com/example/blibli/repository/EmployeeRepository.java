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
	@Query(value= "SELECT COUNT(1) FROM employee", nativeQuery = true) Long countTotalRecords();
	/**
	 * kode diatas untuk menghitung total row
	 * kode dibawah untuk menerima limit dan offset paging
	**/    
	@Query(value = "SELECT * FROM employee LIMIT ?1 OFFSET ?2", nativeQuery = true)
    List<Employee> findPageable(int limit, int offset);
}
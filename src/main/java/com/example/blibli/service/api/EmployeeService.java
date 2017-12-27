package com.example.blibli.service.api;

import com.example.blibli.model.request.EmployeeRequest;
import com.example.blibli.model.response.EmployeeResponse;

import java.util.List;
public interface EmployeeService {

	List<EmployeeResponse> findAll();
	List<EmployeeResponse> findByFirstName(String firstName);

	EmployeeResponse saveEmployee(EmployeeRequest request) throws Exception;

	EmployeeResponse EmployeeStudent(EmployeeRequest request)
        throws Exception;

    void deleteEmployee(String id) throws Exception;
}

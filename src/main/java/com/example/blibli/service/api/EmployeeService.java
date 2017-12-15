package com.example.blibli.service.api;

import com.example.blibli.model.request.EmployeeRequest;
import com.example.blibli.model.response.EmployeeResponse;

import java.util.List;
public class EmployeeService {

	List<EmployeeResponse> findAll();
	List<EmployeeResponse> findByFirstName(String firstName);
	EmployeeResponse saveEmployee(EmployeeRequest request) throws Exception {
		return null;
	}

	EmployeeResponse updateStudent(EmployeeRequest request)
        throws Exception {
			return null;
		}

    void deleteEmployee(String id) throws Exception {
	}
}

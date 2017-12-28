package com.example.blibli.service.api;

import com.example.blibli.model.request.EmployeeRequest;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.base.RestListResponse;

import java.util.List;
public interface EmployeeService {

	List<EmployeeResponse> findAll();
	RestListResponse<EmployeeResponse> findPageable(EmployeeRequest request);
	List<EmployeeResponse> findByName(String name);

	EmployeeResponse saveEmployee(EmployeeRequest request) throws Exception;

	EmployeeResponse updateEmployee(EmployeeRequest request)
        throws Exception;

    void deleteEmployee(String id) throws Exception;
}

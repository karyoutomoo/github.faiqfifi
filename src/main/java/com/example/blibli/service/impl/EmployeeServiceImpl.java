package com.example.blibli.service.impl;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.request.EmployeeRequest;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.repository.EmployeeRepository;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.service.api.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service public class EmployeeServiceImpl implements EmployeeService {
	private static final String EMPLOYEE_NOT_FOUND = "Employee Not Found";

    @Autowired private EmployeeRepository employeeRepository;

    @Autowired private ModelConverterService modelConverterService;

	@Override
	public List<EmployeeResponse> findAll() {
		// TODO Auto-generated method stub
		List<Employee> employees = this.employeeRepository.findAll();
		return this.modelConverterService.convertToEmployeeListResponse(employees);
	}

	@Override
	public List<EmployeeResponse> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeResponse saveEmployee(EmployeeRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeResponse EmployeeStudent(EmployeeRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

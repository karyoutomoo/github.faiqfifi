package com.example.blibli.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.service.api.ModelConverterService;

public class ModelConverterServiceImpl implements ModelConverterService {

	@Override
	public EmployeeResponse convertToEmployeeResponse(Employee employee) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setName(employee.getName());
		employeeResponse.setHireDate(employee.getHireDate());
		employeeResponse.setStatus(employee.getStatus());
		return employeeResponse;
	}

	@Override
	public List<EmployeeResponse> convertToEmployeeListResponse(List<Employee> employees) {
		List<EmployeeResponse> employeeResponses = new ArrayList<>();
		for (Employee employee : employees) {
			EmployeeResponse employeeResponse = new EmployeeResponse();
			employeeResponse.setName(employee.getName());
			employeeResponse.setHireDate(employee.getHireDate());
			employeeResponse.setStatus(employee.getStatus());
			employeeResponses.add(employeeResponse);
		}
		return employeeResponses;
	}

	@Override
	public ReservationResponse convertToReservationResponse(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationResponse> convertToReservationListResponse(List<Reservation> reservations) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReservationResponse convertToReservationListResponse(Reservation reservations) {
		// TODO Auto-generated method stub
		return null;
	}
}

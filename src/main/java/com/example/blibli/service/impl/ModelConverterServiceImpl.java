package com.example.blibli.service.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.model.entity.Guest;

@Service

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
		ReservationResponse reservationResponse = new ReservationResponse();
		reservationResponse.setCheck_in(reservation.getCheckIn());
		reservationResponse.setCheck_out(reservation.getCheckOut());
		reservationResponse.setNum_guest(reservation.getNumGuest());
		return reservationResponse;
	}

	@Override
	public List<ReservationResponse> convertToReservationListResponse(List<Reservation> reservations) {
		List<ReservationResponse> reservationResponses = new ArrayList<>();
		for (Reservation reservation : reservations) {
			ReservationResponse reservationResponse = new ReservationResponse();
			reservationResponse.setCheck_in(reservation.getCheckIn());
			reservationResponse.setCheck_out(reservation.getCheckOut());
			reservationResponse.setNum_guest(reservation.getNumGuest());
			reservationResponses.add(reservationResponse);
		}
		return reservationResponses;
	}

	@Override
	public ReservationResponse convertToReservationListResponse(Reservation reservation) {
		//List<ReservationResponse> reservationResponses = new ArrayList<>();
		ReservationResponse reservationResponses = new ReservationResponse();
		
			reservationResponses.setCheck_in(reservation.getCheckIn());
			reservationResponses.setCheck_out(reservation.getCheckOut());
			reservationResponses.setNum_guest(reservation.getNumGuest());
		return reservationResponses;
	}
}
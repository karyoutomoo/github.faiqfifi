package com.example.blibli.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.entity.Guest;
import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.entity.Transaction;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.GuestResponse;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.TransactionResponse;
import com.example.blibli.service.api.ModelConverterService;

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

	@Override
	public List<TransactionResponse> convertToTransactionListResponse(List<Transaction> transactions) {
		List<TransactionResponse> transactionResponses = new ArrayList<>();
		for (Transaction transaction : transactions) {
			TransactionResponse transactionResponse = new TransactionResponse();
			transactionResponse.setCash(transaction.getCash());
			transactionResponse.setPayment_method(transaction.getPaymentMethod());
			transactionResponses.add(transactionResponse);
		}
		return transactionResponses;
	}

	@Override
	public TransactionResponse convertToTransactionResponse(Transaction transaction) {
		TransactionResponse transactionResponse = new TransactionResponse();
		transactionResponse.setCash(transaction.getCash());
		transactionResponse.setPayment_method(transaction.getPaymentMethod());
		return transactionResponse;
	}

	@Override
	public GuestResponse convertToGuestResponse(Guest guest) {
		GuestResponse guestResponse = new GuestResponse();
		guestResponse.setName(guest.getName());
		guestResponse.setIdentity_number(guest.getIdentity_number());
		guestResponse.setAddress(guest.getAddress());
		guestResponse.setGender(guest.getGender());
		guestResponse.setNationality(guest.getNationality());
		return guestResponse;
	}

	@Override
	public List<GuestResponse> convertToGuestListResponse(List<Guest> guests) {
		List<GuestResponse> guestResponses = new ArrayList<>();
		for (Guest guest : guests) {
			GuestResponse guestResponse = new GuestResponse();
			guestResponse.setName(guest.getName());
			guestResponse.setIdentity_number(guest.getIdentity_number());
			guestResponse.setAddress(guest.getAddress());
			guestResponse.setGender(guest.getGender());
			guestResponse.setNationality(guest.getNationality());
			guestResponses.add(guestResponse);
		}
		return guestResponses;
	}
}
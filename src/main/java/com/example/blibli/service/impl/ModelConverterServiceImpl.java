package com.example.blibli.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.entity.Guest;
import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.entity.Room;
import com.example.blibli.model.entity.Transaction;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.GuestResponse;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.RoomResponse;
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
		reservationResponse.setId_guest(reservation.getIdGuest());
		reservationResponse.setId_employee(reservation.getIdEmployee());
		reservationResponse.setId_room(reservation.getIdRoom());
		reservationResponse.setIs_ok(reservation.getIsOk());
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
			reservationResponse.setId_guest(reservation.getIdGuest());
			reservationResponse.setId_employee(reservation.getIdEmployee());
			reservationResponse.setId_room(reservation.getIdRoom());
			reservationResponse.setIs_ok(reservation.getIsOk());
			reservationResponses.add(reservationResponse);
		}
		return reservationResponses;
	}

	@Override
	public List<TransactionResponse> convertToTransactionListResponse(List<Transaction> transactions) {
		List<TransactionResponse> transactionResponses = new ArrayList<>();
		for (Transaction transaction : transactions) {
			TransactionResponse transactionResponse = new TransactionResponse();
			transactionResponse.setId(transaction.getId());
			transactionResponse.setPayment_method(transaction.getPaymentMethod());
			transactionResponse.setId_reservation(transaction.getIdReservation());
			transactionResponse.setId_guest(transaction.getIdGuest());;
			transactionResponse.setId_room(transaction.getIdRoom());
			transactionResponse.setCash(transaction.getCash());
			transactionResponses.add(transactionResponse);
		}
		return transactionResponses;
	}

	@Override
	public TransactionResponse convertToTransactionResponse(Transaction transaction) {
		TransactionResponse transactionResponse = new TransactionResponse();
		transactionResponse.setId(transaction.getId());
		transactionResponse.setPayment_method(transaction.getPaymentMethod());
		transactionResponse.setId_reservation(transaction.getIdReservation());
		transactionResponse.setId_guest(transaction.getIdGuest());
		transactionResponse.setId_room(transaction.getIdRoom());
		transactionResponse.setCash(transaction.getCash());
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

	@Override
	public RoomResponse convertToRoomResponse(Room room) {
		RoomResponse roomResponse = new RoomResponse();
		roomResponse.setName(room.getName());
		roomResponse.setDescription(room.getDescription());
		roomResponse.setPrice(room.getPrice());
		roomResponse.setAvailability(room.getAvailability());
		return roomResponse;
	}

	@Override
	public List<RoomResponse> convertToRoomListResponse(List<Room> rooms) {
		List<RoomResponse> roomResponses = new ArrayList<>();
		for (Room room : rooms) {
			RoomResponse roomResponse = new RoomResponse();
			roomResponse.setName(room.getName());
			roomResponse.setDescription(room.getDescription());
			roomResponse.setPrice(room.getPrice());
			roomResponse.setAvailability(room.getAvailability());
			roomResponses.add(roomResponse);
		}
		return roomResponses;
	}
}
package com.example.blibli.service.api;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.entity.Transaction;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.TransactionResponse;

import java.util.List;

public interface ModelConverterService {

    EmployeeResponse convertToEmployeeResponse(Employee employee);

    List<EmployeeResponse> convertToEmployeeListResponse(List<Employee> employees);
    
    ReservationResponse convertToReservationResponse(Reservation reservation);
    
	List<ReservationResponse> convertToReservationListResponse(List<Reservation> reservations);
	
	ReservationResponse convertToReservationListResponse(Reservation reservations);
	
	List<TransactionResponse> convertToTransactionListResponse(List<Transaction> transactions);
	
	TransactionResponse convertToTransactionResponse(Transaction transaction);
}
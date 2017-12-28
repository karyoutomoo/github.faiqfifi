package com.example.blibli.service.api;

import com.example.blibli.model.request.ReservationRequest;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.base.RestListResponse;

import java.util.List;
public interface ReservationService {
	
	List<ReservationResponse> findAll();
	RestListResponse<ReservationResponse> findPageable(ReservationRequest request);
	List<ReservationResponse> findbyId(String id);
	
	ReservationResponse saveReservation(ReservationRequest request) throws Exception;
	
	ReservationResponse updateReservation(ReservationRequest request) throws Exception;
	
	void deleteReservation(String id) throws Exception;
	List<ReservationResponse> findByName(String name);
}

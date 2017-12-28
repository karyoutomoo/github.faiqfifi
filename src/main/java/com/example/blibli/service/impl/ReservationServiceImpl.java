package com.example.blibli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.entity.Guest;
import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.request.ReservationRequest;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.base.PageMetaData;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.repository.ReservationRepository;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.service.api.ReservationService;
import com.example.blibli.repository.GuestRepository;

import java.math.BigDecimal;
import java.util.Date;

public class ReservationServiceImpl implements ReservationService{
	private static final String RESERVATION_NOT_FOUND = "RESERVATION NOT FOUND";
	
	@Autowired private ReservationRepository reservationRepository;
	@Autowired private GuestRepository guestRepository;
	@Autowired private ModelConverterService modelConverterService;
	
	@Override
	public List<ReservationResponse> findAll() {
		// TODO Auto-generated method stub
		List<Reservation> reservations = this.reservationRepository.findAll();
		return this.modelConverterService.convertToReservationListResponse(reservations);
	}

	@Override
	public RestListResponse<ReservationResponse> findPageable(ReservationRequest request) {
		BigDecimal totalRecords = BigDecimal.valueOf(this.reservationRepository.countTotalRecords());
        int size = request.getPageMetaData().getSize();
        int page = request.getPageMetaData().getPage();
        int offset = page * size;
        List<Reservation> reservations = this.reservationRepository.findPageable(size, offset);
        List<ReservationResponse> reservationResponses =
            this.modelConverterService.convertToReservationListResponse(reservations);
        return new RestListResponse<>(null, null, true, reservationResponses,
            new PageMetaData(page, size, totalRecords));
	}

	@Override
	public List<ReservationResponse> findByName(String name) {
		List<Guest> reservations = this.reservationRepository.findByName(name);
		return this.modelConverterService.convertToReservationListResponse(reservations);
	}
	
	@Override
	public List<ReservationResponse> findbyId(String id) {
		List<Reservation> reservations = this.reservationRepository.findById(id);
		return this.modelConverterService.convertToReservationListResponse(reservations);
	}

	@Override
	public ReservationResponse saveReservation(ReservationRequest request) throws Exception {
		Reservation reservation = new Reservation();
		//employee.setName(request.getName());
		reservation.setCheckIn(request.getCheck_in());
		reservation.setCheckOut(request.getCheck_out());
		reservation.setNumGuest(request.getNum_guest());
		return this.modelConverterService.convertToReservationResponse(this.reservationRepository.save(reservation));
	}

	@Override
	public ReservationResponse updateReservation(ReservationRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReservation(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
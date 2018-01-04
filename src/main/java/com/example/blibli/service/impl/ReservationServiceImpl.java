package com.example.blibli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Reservation;
import com.example.blibli.model.request.ReservationRequest;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.base.PageMetaData;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.repository.ReservationRepository;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.service.api.ReservationService;
import java.math.BigDecimal;

@Service
public class ReservationServiceImpl implements ReservationService{

	private static final String RESERVATION_NOT_FOUND = "RESERVATION NOT FOUND";
	
	@Autowired private ReservationRepository reservationRepository;
	@Autowired private ModelConverterService modelConverterService;
	
	@Override
	public List<ReservationResponse> findAll() {
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
	public ReservationResponse findbyId(String id) {
		Reservation reservation = this.reservationRepository.findById(id);
		return this.modelConverterService.convertToReservationResponse(reservation);
	}

	@Override
	public ReservationResponse saveReservation(ReservationRequest request) throws Exception {
		Reservation reservation = new Reservation();
		reservation.setCheckIn(request.getCheck_in());
		reservation.setCheckOut(request.getCheck_out());
		reservation.setNumGuest(request.getNum_guest());
		reservation.setIdGuest(request.getId_guest());
		reservation.setIdEmployee(request.getId_employee());
		reservation.setIdRoom(request.getId_room());
		reservation.setIsOk(request.getIs_ok());
		return this.modelConverterService.convertToReservationResponse(this.reservationRepository.save(reservation));
	}

	@Override
	public ReservationResponse updateReservation(ReservationRequest request) throws Exception {
		
		Reservation reservation = this.reservationRepository.findById(request.getId());
		if(reservation == null)
		{
			throw new Exception(ReservationServiceImpl.RESERVATION_NOT_FOUND);
		}
		else {
			reservation.setCheckIn(request.getCheck_in());
			reservation.setCheckOut(request.getCheck_out());
			reservation.setNumGuest(request.getNum_guest());
			reservation.setIdGuest(request.getId_guest());
			reservation.setIdEmployee(request.getId_employee());
			reservation.setIdRoom(request.getId_room());
			reservation.setIsOk(request.getIs_ok());
		}
			return this.modelConverterService.convertToReservationResponse(this.reservationRepository.save(reservation));
	}

	@Override
	public void deleteReservation(String id) throws Exception {
		
		Reservation reservation = this.reservationRepository.findById(id);
		if (reservation== null)
			throw new Exception(ReservationServiceImpl.RESERVATION_NOT_FOUND);
		else this.reservationRepository.delete(reservation);
		
	}
}
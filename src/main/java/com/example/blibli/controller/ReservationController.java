package com.example.blibli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.blibli.model.request.ReservationRequest;
import com.example.blibli.model.response.ReservationResponse;
import com.example.blibli.model.response.base.BaseRestResponse;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.model.response.base.RestSingleResponse;
import com.example.blibli.service.api.ReservationService;

@RestController public class ReservationController {
	@Autowired private ReservationService reservationService;
	
	@PostMapping(path = "/api/reservations", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseBody
    public RestListResponse<ReservationResponse> getReservations(@RequestBody ReservationRequest request) {
        RestListResponse<ReservationResponse> response;
        try {
            response = this.reservationService.findPageable(request);
        } catch (Exception e) {
            response = new RestListResponse<>(null, e.getMessage(), false);
        }
        return response;
    }
	
	@PostMapping(path = "/api/reservation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<ReservationResponse> saveReservation(@RequestBody ReservationRequest request) {
        RestSingleResponse<ReservationResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.reservationService.saveReservation(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @PutMapping(path = "/api/reservation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<ReservationResponse> updateReservation(@RequestBody ReservationRequest request) {
        RestSingleResponse<ReservationResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.reservationService.updateReservation(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @DeleteMapping(path = "/api/reservation/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody public BaseRestResponse deleteReservation(@PathVariable("id") String id) {
        BaseRestResponse response;
        try {
            this.reservationService.deleteReservation(id);
            response = new BaseRestResponse(null, null, true);
        } catch (Exception e) {
            response = new BaseRestResponse(null, e.getMessage(), false);
        }
        return response;
    }
}

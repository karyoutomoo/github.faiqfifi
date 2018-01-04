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

import com.example.blibli.model.request.GuestRequest;
import com.example.blibli.model.response.GuestResponse;
import com.example.blibli.model.response.base.BaseRestResponse;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.model.response.base.RestSingleResponse;
import com.example.blibli.service.api.GuestService;

@RestController public class GuestController {
	@Autowired private GuestService guestService;
	
	@PostMapping(path = "/api/guests", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseBody
    public RestListResponse<GuestResponse> getGuests(@RequestBody GuestRequest request) {
        RestListResponse<GuestResponse> response;
        try {
            response = this.guestService.findPageable(request);
        } catch (Exception e) {
            response = new RestListResponse<>(null, e.getMessage(), false);
        }
        return response;//clear
    }
	
	@PostMapping(path = "/api/guest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<GuestResponse> saveGuest(@RequestBody GuestRequest request) {
        RestSingleResponse<GuestResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.guestService.saveGuest(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;//clear
    }
	@PutMapping(path = "/api/guest", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<GuestResponse> updateGuest(@RequestBody GuestRequest request) {
        RestSingleResponse<GuestResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.guestService.updateGuest(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;//
    }
	@DeleteMapping(path = "/api/guest/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody public BaseRestResponse deleteGuest(@PathVariable("id") String id) {
        BaseRestResponse response;
        try {
            this.guestService.deleteGuest(id);
            response = new BaseRestResponse(null, null, true);
        } catch (Exception e) {
            response = new BaseRestResponse(null, e.getMessage(), false);
        }
        return response;
    }
}

package com.example.blibli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.blibli.model.request.RoomRequest;
import com.example.blibli.model.response.RoomResponse;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.model.response.base.RestSingleResponse;
import com.example.blibli.service.api.RoomService;

@RestController
public class AvailabilityController {
	@Autowired private RoomService roomService;
	
	@PostMapping(path = "/api/rooms", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseBody
    public RestListResponse<RoomResponse> getRooms(@RequestBody RoomRequest request) {
        RestListResponse<RoomResponse> response;
        try {
            response = this.roomService.findPageable(request);
        } catch (Exception e) {
            response = new RestListResponse<>(null, e.getMessage(), false);
        }
        return response;//clear
    }
	
	@PutMapping(path = "/api/room", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<RoomResponse> updateRoom(@RequestBody RoomRequest request) {
        RestSingleResponse<RoomResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.roomService.updateRoom(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;//
    }
}

package com.example.blibli.service.api;

import java.util.List;

import com.example.blibli.model.request.RoomRequest;
import com.example.blibli.model.response.RoomResponse;
import com.example.blibli.model.response.base.RestListResponse;

public interface RoomService {
	
	List<RoomResponse> findAll();
	RestListResponse<RoomResponse> findPageable(RoomRequest request);
	RoomResponse updateRoom(RoomRequest request) throws Exception;
}

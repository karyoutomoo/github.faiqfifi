package com.example.blibli.service.api;

import java.util.List;

import com.example.blibli.model.request.GuestRequest;
import com.example.blibli.model.response.GuestResponse;
import com.example.blibli.model.response.base.RestListResponse;

public interface GuestService {
	List<GuestResponse> findAll();
	RestListResponse<GuestResponse> findPageable(GuestRequest request);
	
	GuestResponse findByName(String name);
	
	GuestResponse saveGuest(GuestRequest request) throws Exception;
	
	GuestResponse updateGuest(GuestRequest request) throws Exception;
	
	void deleteGuest(String id) throws Exception;
}

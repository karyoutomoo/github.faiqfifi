package com.example.blibli.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Guest;
import com.example.blibli.model.request.GuestRequest;
import com.example.blibli.model.response.GuestResponse;
import com.example.blibli.model.response.base.PageMetaData;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.repository.GuestRepository;
import com.example.blibli.service.api.GuestService;
import com.example.blibli.service.api.ModelConverterService;

@Service
public class GuestServiceImpl implements GuestService{
	private static final String GUEST_NOT_FOUND = "Guest Not Found";
	@Autowired private GuestRepository guestRepository;
	@Autowired private ModelConverterService modelConverterService;
	
	@Override
	public List<GuestResponse> findAll() {
		List<Guest> guests = this.guestRepository.findAll();
		return this.modelConverterService.convertToGuestListResponse(guests);
	}

	@Override
	public RestListResponse<GuestResponse> findPageable(GuestRequest request) {
		BigDecimal totalRecords = BigDecimal.valueOf(this.guestRepository.countTotalRecords());
        //System.out.println(request.toString());
        int size = request.getPageMetaData().getSize();
        int page = request.getPageMetaData().getPage();
        int offset = page * size;
        List<Guest> guests = this.guestRepository.findPageable(size, offset);
        //System.out.println(guests.toString());
        //System.out.println(guests.size());
        //System.out.println(guests.get(0).getName());
        List<GuestResponse> guestResponses =
            this.modelConverterService.convertToGuestListResponse(guests);
        return new RestListResponse<>(null, null, true, guestResponses,
            new PageMetaData(page, size, totalRecords));
	}

	@Override
	public GuestResponse findByName(String name) {
		Guest guest = this.guestRepository.findByName(name);
		return this.modelConverterService.convertToGuestResponse(guest);
	}

	@Override
	public GuestResponse saveGuest(GuestRequest request) throws Exception {
		Guest guest = new Guest();
		guest.setName(request.getName());
		guest.setIdentity_number(request.getIdentity_number());
		guest.setAddress(request.getAddress());
		guest.setGender(request.getGender());
		guest.setNationality(request.getNationality());
		return this.modelConverterService.convertToGuestResponse(this.guestRepository.save(guest));
	}

	@Override
	public GuestResponse updateGuest(GuestRequest request) throws Exception {
		Guest guest = this.guestRepository.findById(request.getId());
		if (guest == null)
		{
			throw new Exception(GuestServiceImpl.GUEST_NOT_FOUND);
		}
		else {
			guest.setName(request.getName());
			guest.setIdentity_number(request.getIdentity_number());
			guest.setAddress(request.getAddress());
			guest.setGender(request.getGender());
			guest.setNationality(request.getNationality());
			return this.modelConverterService.convertToGuestResponse(this.guestRepository.save(guest));
		}
	}

	@Override
	public void deleteGuest(String id) throws Exception {
		Guest guest = this.guestRepository.findById(id);
		if (guest == null)
		{
			throw new Exception(GuestServiceImpl.GUEST_NOT_FOUND);
		}
		else {
			this.guestRepository.delete(guest);
		}
	}

}

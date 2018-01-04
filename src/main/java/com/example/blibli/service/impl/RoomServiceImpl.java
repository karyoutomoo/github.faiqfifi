package com.example.blibli.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blibli.model.entity.Room;
import com.example.blibli.model.request.RoomRequest;
import com.example.blibli.model.response.RoomResponse;
import com.example.blibli.model.response.base.PageMetaData;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.repository.RoomRepository;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.service.api.RoomService;

@Service public class RoomServiceImpl implements RoomService{
	private static final String ROOM_NOT_FOUND = "Room NOT FOUND!";
	
	@Autowired private RoomRepository roomRepository;

    @Autowired private ModelConverterService modelConverterService;
	@Override
	public List<RoomResponse> findAll() {
		List<Room> rooms = this.roomRepository.findAll();
		return this.modelConverterService.convertToRoomListResponse(rooms);
	}

	@Override
	public RestListResponse<RoomResponse> findPageable(RoomRequest request) {
		BigDecimal totalRecords = BigDecimal.valueOf(this.roomRepository.countTotalRecords());
        System.out.println(request.toString());
        int size = request.getPageMetaData().getSize();
        int page = request.getPageMetaData().getPage();
        int offset = page * size;
        List<Room> rooms = this.roomRepository.findPageable(size, offset);
        List<RoomResponse> roomResponses =
            this.modelConverterService.convertToRoomListResponse(rooms);
        return new RestListResponse<>(null, null, true, roomResponses,
            new PageMetaData(page, size, totalRecords));
	}

	@Override
	public RoomResponse updateRoom(RoomRequest request) throws Exception {
		Room room = this.roomRepository.findById(request.getId());
		if (room == null)
		{
			throw new Exception(RoomServiceImpl.ROOM_NOT_FOUND);
		}
		else {
			//room.setName(request.getName());
			room.setAvailability(request.getAvailability());
			return this.modelConverterService.convertToRoomResponse(this.roomRepository.save(room));
		}
	}

}

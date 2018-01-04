package com.example.blibli.model.response;

import com.example.blibli.model.response.base.BaseResponse;

public class RoomResponse extends BaseResponse {
	private String name;
	private String description;
	private Integer price;
	private String availability;
	public RoomResponse() {}
	public RoomResponse(String name, String description, Integer price, String availability)
	{
		this.name=name;
		this.description=description;
		this.price=price;
		this.availability=availability;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
}

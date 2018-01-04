package com.example.blibli.model.response;

import com.example.blibli.model.response.base.BaseResponse;

public class GuestResponse extends BaseResponse {
	private String name;
	private Integer identity_number;
	private String address;
	private String gender;
	private String nationality;
	public GuestResponse() {}
	public GuestResponse(String name, Integer identity_number, String address, String gender, String nationality) {
		this.name=name;
		this.identity_number=identity_number;
		this.address=address;
		this.gender=gender;
		this.nationality=nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdentity_number() {
		return identity_number;
	}
	public void setIdentity_number(Integer identity_number) {
		this.identity_number = identity_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}

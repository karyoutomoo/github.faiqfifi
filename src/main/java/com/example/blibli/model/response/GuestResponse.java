package com.example.blibli.model.response;

import com.example.blibli.model.response.base.BaseResponse;
import com.example.blibli.model.response.base.PageMetaData;

public class GuestResponse extends BaseResponse {
	private String name;
	private Integer identity_number;
	private String address;
	private String gender;
	private String nationality;
	private PageMetaData pageMetaData;
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
	public PageMetaData getPageMetaData() {
		return pageMetaData;
	}
	public void setPageMetaData(PageMetaData pageMetaData) {
		this.pageMetaData = pageMetaData;
	}
	
	
}

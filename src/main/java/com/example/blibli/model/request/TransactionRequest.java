package com.example.blibli.model.request;

import com.example.blibli.model.response.base.PageMetaData;

public class TransactionRequest {
	private String id;
	private String payment_method;
	private String id_reservation;
	private String id_guest;
	private String id_room;
	private Integer cash;
	private PageMetaData pageMetaData;
	public String getId() {
		return id;
	}
	
	public String getId_guest() {
		return id_guest;
	}

	public void setId_guest(String id_guest) {
		this.id_guest = id_guest;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Integer getCash() {
		return cash;
	}
	public void setCash(Integer cash) {
		this.cash = cash;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getId_reservation() {
		return id_reservation;
	}
	public void setId_reservation(String id_reservation) {
		this.id_reservation = id_reservation;
	}
	public PageMetaData getPageMetaData() {
		return pageMetaData;
	}
	public void setPageMetaData(PageMetaData pageMetaData) {
		this.pageMetaData = pageMetaData;
	}

	public String getId_room() {
		return id_room;
	}

	public void setId_room(String id_room) {
		this.id_room = id_room;
	}
	
	
}

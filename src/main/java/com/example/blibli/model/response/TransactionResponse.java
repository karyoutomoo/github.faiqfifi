package com.example.blibli.model.response;

import com.example.blibli.model.response.base.BaseResponse;

public class TransactionResponse extends BaseResponse{
	private String id;
	private Integer cash;
	private String payment_method;
	private String id_reservation;
	private String id_room;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCash() {
		return cash;
	}
	public void setCash(Integer integer) {
		this.cash = integer;
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
	public String getId_room() {
		return id_room;
	}
	public void setId_room(String id_room) {
		this.id_room = id_room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

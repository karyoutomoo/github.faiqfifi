package com.example.blibli.model.response;

import com.example.blibli.model.response.base.BaseResponse;
import java.util.Date;
public class ReservationResponse extends BaseResponse{
	private Date check_in;
	private Date check_out;
	private Integer num_guest;
	private String id_guest;
	private String id_employee;
	private String id_room;
	private String is_ok;
	public String getIs_ok() {
		return is_ok;
	}
	public void setIs_ok(String is_ok) {
		this.is_ok = is_ok;
	}
	public Integer getNum_guest() {
		return num_guest;
	}
	public void setNum_guest(Integer num_guest) {
		this.num_guest = num_guest;
	}
	public Date getCheck_in() {
		return check_in;
	}
	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}
	public Date getCheck_out() {
		return check_out;
	}
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	public String getId_guest() {
		return id_guest;
	}
	public void setId_guest(String id_guest) {
		this.id_guest = id_guest;
	}
	public String getId_employee() {
		return id_employee;
	}
	public void setId_employee(String id_employee) {
		this.id_employee = id_employee;
	}
	public String getId_room() {
		return id_room;
	}
	public void setId_room(String id_room) {
		this.id_room = id_room;
	}
	
}

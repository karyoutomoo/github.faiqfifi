package com.example.blibli.model.response;

import com.example.blibli.model.response.base.BaseResponse;
import java.util.Date;
public class EmployeeResponse extends BaseResponse{
	private String name;
	private Date hireDate;
	
	public EmployeeResponse() {}
	public EmployeeResponse(String name, Date hireDate) {
		this.name=name;
		this.hireDate=hireDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate=hireDate;
	}
}

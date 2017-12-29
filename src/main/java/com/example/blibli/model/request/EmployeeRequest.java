package com.example.blibli.model.request;

import com.example.blibli.model.response.base.PageMetaData;

import java.util.Date;

public class EmployeeRequest {
	private String id;
	private String name;
	private Date hireDate;
	private String status;
	private PageMetaData pageMetaData;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public PageMetaData getPageMetaData() {
		return pageMetaData;
	}
	public void setPageMetaData(PageMetaData pageMetaData) {
		this.pageMetaData = pageMetaData;
	}
	public String getName() {
		return name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}

package com.example.blibli.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = Employee.TABLE_NAME)
public class Employee {
	public static final String TABLE_NAME = "employee";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
	
	@Column(name="name", nullable=false)
    private String name;

    @Column(name="hiredate", columnDefinition = "DATE", nullable=false)
    private Date hireDate;

    @Column(name="status", nullable=false)
    private String status;

    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


    }

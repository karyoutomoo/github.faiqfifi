package com.example.blibli.model.entity;

import java.sql.Date;

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

    @Column(name="hiredate", nullable=false)
    private Date hireDate;

    @Column(name="status", nullable=false)
    private String status;

    }

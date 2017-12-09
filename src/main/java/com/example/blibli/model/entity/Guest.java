package com.example.blibli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = Guest.TABLE_NAME)
public class Guest {
	public static final String TABLE_NAME = "guest";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
    
    @Column(name="name", nullable=false)
    private String name;

    @Column(name="identity_number", nullable=false)
    private Integer identity_number;

    @Column(name="address", nullable=false)
    private String address;

    @Column(name="gender", nullable=false)
    private String gender;

    @Column(name="nationality", nullable=false)
    private String nationality;
}

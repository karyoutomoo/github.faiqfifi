package com.example.blibli.model.entity;

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

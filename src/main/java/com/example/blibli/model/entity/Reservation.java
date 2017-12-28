package com.example.blibli.model.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = Reservation.TABLE_NAME)
public class Reservation {
	public static final String TABLE_NAME = "reservation";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;

    @Column(name="check_in", columnDefinition = "DATE", nullable=false)
    private Date checkIn;

    @Column(name="check_out", columnDefinition = "DATE", nullable=false)
    private Date checkOut;

    @Column(name="num_guest", nullable=false)
    private Integer numGuest;
    
    @Column(name="id_guest", nullable=false)
    private String idGuest;

    @Column(name="id_employee", nullable=false)
    private String idEmployee;
    
    @Column(name="id_room", nullable=false)
    private String idRoom;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(String idRoom) {
		this.idRoom = idRoom;
	}

	public String getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(String idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(String idGuest) {
		this.idGuest = idGuest;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getNumGuest() {
		return numGuest;
	}

	public void setNumGuest(Integer numGuest) {
		this.numGuest = numGuest;
	}
    
}
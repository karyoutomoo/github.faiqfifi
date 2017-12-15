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
	
	@Column(name="id_room", nullable=false)
    private String idRoom;

    @Column(name="id_employee", nullable=false)
    private String idEmployee;

    @Column(name="id_guest", nullable=false)
    private String idGuest;

    @Column(name="check_in", nullable=false)
    private Date checkIn;

    @Column(name="check_out", nullable=false)
    private Date checkOut;

    @Column(name="num_guest", nullable=false)
    private Integer numGuest;
    
}
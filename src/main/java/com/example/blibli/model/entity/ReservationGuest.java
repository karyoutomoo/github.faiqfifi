package com.example.blibli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = ReservationGuest.TABLE_NAME)
public class ReservationGuest {
	public static final String TABLE_NAME = "reservation_guest";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
    
	@Column(name="id_reservation", nullable=false)
    private String idReservation;

    @Column(name="id_guest", nullable=false)
    private String idGuest;

    }

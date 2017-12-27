package com.example.blibli.model.entity;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(String idReservation) {
		this.idReservation = idReservation;
	}

	public String getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(String idGuest) {
		this.idGuest = idGuest;
	}

    }

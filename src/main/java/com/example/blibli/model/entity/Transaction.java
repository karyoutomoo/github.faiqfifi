package com.example.blibli.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = Transaction.TABLE_NAME)
public class Transaction {
	public static final String TABLE_NAME = "transaction";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
    
	@Column(name="cash", nullable=false)
    private String cash;

    @Column(name="payment_method", nullable=false)
    private String paymentMethod;

    @Column(name="id_reservation", nullable=false)
    private String idReservation;
    
    @Column(name="id_guest", nullable=false)
    private String idGuest;
    
    @Column(name="id_room", nullable=false)
    private String idRoom;

	public String getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(String idGuest) {
		this.idGuest = idGuest;
	}

	public String getIdRoom() {
		return idRoom;
	}

	public void setIdRoom(String idRoom) {
		this.idRoom = idRoom;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(String idReservation) {
		this.idReservation = idReservation;
	}

    
    }
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
    private Integer cash;

    @Column(name="payment_method", nullable=false)
    private String paymentMethod;

    @Column(name="id_reservation", nullable=false)
    private String idReservation;

    }
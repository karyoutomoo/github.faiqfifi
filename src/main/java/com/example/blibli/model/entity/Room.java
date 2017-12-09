package com.example.blibli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = Room.TABLE_NAME)
public class Room {
	public static final String TABLE_NAME = "room";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
    
	@Column(name="id_class", nullable=false)
    private String idClass;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="capacity", nullable=false)
    private Integer capacity;

    @Column(name="status", nullable=false)
    private String status;

    }

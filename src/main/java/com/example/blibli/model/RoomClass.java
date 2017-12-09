package com.example.blibli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = RoomClass.TABLE_NAME)
public class RoomClass {
	public static final String TABLE_NAME = "room_class";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
    
    @Column(name="name", nullable=false)
    private String name;

    @Column(name="description", nullable=false)
    private String description;

    @Column(name="price", nullable=false)
    private Integer price;

    @Column(name="bathroom", nullable=false)
    private Integer bathroom;

    @Column(name="ac", nullable=false)
    private String ac;

    @Column(name="freepark", nullable=false)
    private String freepark;

    @Column(name="wifi", nullable=false)
    private String wifi;

    @Column(name="breakfast", nullable=false)
    private String breakfast;
}

package com.example.blibli.model.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = Login.TABLE_NAME)
public class Login {
	public static final String TABLE_NAME = "login";
	@Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    private String id;
    
    @Column(name="username", nullable=false)
    private String username;

    @Column(name="last_login", nullable=false)
    private Time lastLogin;

    @Column(name="status_login", nullable=false)
    private Boolean statusLogin;
}

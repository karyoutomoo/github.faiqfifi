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

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Time getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Time lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Boolean getStatusLogin() {
		return statusLogin;
	}

	public void setStatusLogin(Boolean statusLogin) {
		this.statusLogin = statusLogin;
	}

	@Column(name="status_login", nullable=false)
    private Boolean statusLogin;
}

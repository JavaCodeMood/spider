package com.dayspass.datacenter.bean;

import java.io.Serializable;

public class User implements Serializable{

	
	private static final long serialVersionUID = -6813272594614288879L;

	private Integer id;
	
	private String username;
	
	private String password;
	
	private String sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}

package com.pixelindia.model;

import java.io.Serializable;

public class MessageDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	 private String name;
	 private String emailid;
	 private String query;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

}

package com.pixelindia.model;

import com.opensymphony.xwork2.ActionSupport;

public class BookingDetails extends ActionSupport {
	private static final long serialVersionUID = 1L;
private Integer pid;
private String name;
private String mobileno;
private String meetup;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getMeetup() {
	return meetup;
}
public void setMeetup(String meetup) {
	this.meetup = meetup;
}
}

package com.prowing.proxy.dynamic_Proxy;

import java.util.Date;

public class Attendance {
	private boolean isPresent;
	private Date date;
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	public Attendance(boolean isPresent, Date date) {
		super();
		this.isPresent = isPresent;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}

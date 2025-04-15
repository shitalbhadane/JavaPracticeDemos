package com.prowing.proxy.dynamic_Proxy;

public class StudentProxy extends Student {

	public StudentProxy(Attendance attendence) {
		super(attendence);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attendSession() {
		// TODO Auto-generated method stub
		if (super.getAttendence().isPresent()) {
			super.attendSession();
		} else {
			throw new RuntimeException("Student is not present So not able to attend the session");
		}
	}
}

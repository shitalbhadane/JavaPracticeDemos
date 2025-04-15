package com.prowing.proxy.dynamic_Proxy;

public class Student implements DailySession {
	private Attendance attendence;

	public Student(Attendance attendence) {
		super();
		this.attendence = attendence;
	}

	public Attendance getAttendence() {
		return attendence;
	}

	public void setAttendence(Attendance attendence) {
		this.attendence = attendence;
	}

	public void attendSession() {
		// TODO Auto-generated method stub
		System.out.println("Student is attending the session.....");

	}

}

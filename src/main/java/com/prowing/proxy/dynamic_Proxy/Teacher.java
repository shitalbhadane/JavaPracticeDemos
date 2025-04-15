package com.prowing.proxy.dynamic_Proxy;

import java.util.Date;

public class Teacher {
public static void main(String[] args) {
	DailySession student=new StudentProxy(new Attendance(true, new Date()));
	student.attendSession();
}
}

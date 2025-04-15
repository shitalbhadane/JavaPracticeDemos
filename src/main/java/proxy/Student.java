package proxy;

public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Attendance attendance) {
		super();
		this.attendance = attendance;
	}

	private Attendance attendance;

	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

	public void attendSession() {
		// TODO Auto-generated method stub

		System.out.println("Student is attending the session.....");
	}

	public void attendSession(Integer id) {
		System.out.println("Student with id [ " + id + " ] attending ");
	}
}
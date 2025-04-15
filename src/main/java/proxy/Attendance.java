package proxy;

import java.util.Date;

public class Attendance {
	private boolean istrue;
	private Date date;

	public Attendance(boolean istrue, Date date) {
		super();
		this.istrue = istrue;
		this.date = date;
	}

	public boolean isIstrue() {
		return istrue;
	}

	public void setIstrue(boolean istrue) {
		this.istrue = istrue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

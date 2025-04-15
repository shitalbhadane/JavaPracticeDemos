package dynamicproxy;

public class ITEmployee implements IEmployee {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private double salary;

	public void giveHike(double amount) {
		// TODO Auto-generated method stub
		this.salary=this.salary+amount;
				
	}

	public void payCut(double amount) {
		// TODO Auto-generated method stub
		this.salary=this.getSalary()-amount;
	}

}

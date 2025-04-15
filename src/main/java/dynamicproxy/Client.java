package dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		ITEmployee itEmployee = new ITEmployee();
		itEmployee.setId(101);
		itEmployee.setName("shital");
		itEmployee.setSalary(50000);
		EmployeeSalaryInvocationHandler invocationHandler = new EmployeeSalaryInvocationHandler(itEmployee);
		IEmployee iEmployee = (IEmployee) Proxy.newProxyInstance(ITEmployee.class.getClassLoader(),
				new Class[] { IEmployee.class }, invocationHandler);
		iEmployee.giveHike(6500);
		System.out.println(iEmployee.getSalary());

	}
}

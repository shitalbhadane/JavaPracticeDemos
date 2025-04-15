package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {
	private IEmployee employeeTarget;

	public EmployeeSalaryInvocationHandler(IEmployee employeeTarget) {
		this.employeeTarget = employeeTarget;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object returnValue = method.invoke(employeeTarget, args);

		return returnValue;

	}

}

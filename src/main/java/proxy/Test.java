package proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class<?> studentInfo = Class.forName("proxy.Student");// by using this we can lading the object
		Student student = (Student) studentInfo.newInstance();
		/*
		 * Constructor<?>[] constructors = studentInfo.getConstructors(); for
		 * (Constructor constrs : constructors) { System.out.println(constrs); }
		 * 
		 * Method[] declaredMethods=studentInfo.getDeclaredMethods(); for(Method
		 * declaMeth:declaredMethods) { System.out.println(declaMeth); }
		 */
		Class[] methodArgsType = new Class[] { Integer.class };

		Method method = studentInfo.getDeclaredMethod("attendSession", methodArgsType);
		method.invoke(student, 101);
		Method method2=studentInfo.getDeclaredMethod("attendSession");
		method2.invoke(student, null);	
	}
	
}

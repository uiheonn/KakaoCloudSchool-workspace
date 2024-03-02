package mycom.dept.test;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Method[] declared = MyService.class.getDeclaredMethods();
		for(Method m:declared) {
			PrintAnnotation printAnnotation = m.getAnnotation(PrintAnnotation.class);
			System.out.println(printAnnotation.value());
			System.out.println(printAnnotation.number());
		}
	}

}

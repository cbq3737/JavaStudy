package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		
//		Constructor[] cons= c.getConstructors();
//		for(Constructor cc: cons) {
//			System.out.println(cc);
//		}
		Method[] m = c.getMethods();
		for(Method mm:m) {
			System.out.println(mm);
		}
	}
}

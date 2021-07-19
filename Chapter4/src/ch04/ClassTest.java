package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = Class.forName("ch04.Person");
		//Object형이므로 Person형을 맞춰준다.
		Person person = (Person)c1.newInstance();
		person.setName("LEE");
		System.out.println(person);
		
		//getClass를 사용하려면 이미 인스턴스가 생성된 상태여야한다.
//		Class c2 = person.getClass();
//		Person p = (Person)c2.newInstance();
//		System.out.println(p);
//		
//		
//		
//		Class[] parameterTypes = {String.class};
//		Constructor cons = c2.getConstructor(parameterTypes);
//		
//		Object[] initargs = {"Kim"};
//		Person kimPerson = (Person)cons.newInstance(initargs);
//		System.out.println(kimPerson);
//		
	}
}

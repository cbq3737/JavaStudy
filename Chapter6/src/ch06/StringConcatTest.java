package ch06;

public class StringConcatTest {

	public static void main(String[] args) {
			String s1  = "hi";
			String s2 = "hello";
			
			StringConcatImpl impl = new StringConcatImpl();
			impl.makeString(s1, s2);
			
			StringConcat sc = (s,v) ->{
				System.out.println(s1+","+s2);
			};
			sc.makeString(s1, s2);
	}
}

package ch04;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber mynumber = (int x, int y) -> {
			return Math.max(x, y);
		};
		System.out.println(mynumber.getMax(10, 20));
	}
}

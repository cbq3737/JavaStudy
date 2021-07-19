package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int devide(int num1,int num2);
	
	//default 메서드,인터페이스에대한 설명 메서드
	default void description() {
		System.out.println("정수의 사칙연산을제공한다.");
		myMethod();
	}
	
	//정적 메서드
	static int total(int[] arr) {
		int total =0;
		for(int num:arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	private void myMethod() {
		System.out.println("my Method");
	}
	private static void myStaticMethod() {
		System.out.println("my static Method");
	}
}

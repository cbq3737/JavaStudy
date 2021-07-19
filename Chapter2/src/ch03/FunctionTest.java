package ch03;

public class FunctionTest {
	public static int addNum(int num1,int num2) {
			int result;
			result = num1+num2;
			return result;
	}
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	public static int calSum() {
		int sum =0;
		int i;
		for(i=0;i<=100;i++) {
			sum+= i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 5;
		String greeting = "안녕하세요";
		System.out.println(addNum(num1,num2));
		sayHello(greeting);
		System.out.println(calSum());
	}
}

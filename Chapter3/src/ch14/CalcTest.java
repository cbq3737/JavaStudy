package ch14;

public class CalcTest {
	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 2; 
//		
//		CompleteCalc calc = new CompleteCalc();
//		
//		System.out.println(calc.add(num1, num2));
//		System.out.println(calc.substract(num1, num2));
//		System.out.println(calc.times(num1, num2));
//		System.out.println(calc.devide(num1, num2));
		
		//default메서드의 사용
		CompleteCalc calc = new CompleteCalc();
		calc.description();
		
		//정적메서드를 호출하는 방법
		int[] arr = {1,2,3};
		System.out.println(Calc.total(arr));
		
	}
}

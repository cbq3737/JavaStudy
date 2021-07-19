package ch03;

public class AddTest {

	public static void main(String[] args) {
		//람다식 함수를 add라는 변수에 넣어준 것.-> 인터페이스의 add함수를 구현한것
		Add add_function =(x,y) -> {return x+y;};
		System.out.println(add_function.add(2, 3));
	}
}

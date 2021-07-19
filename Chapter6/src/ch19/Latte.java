package ch19;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);	
	}
	//brewing을 재정의
	public void brewing() {
		super.brewing(); //super의 brewing을 먼저 부른다.
		System.out.print(" Adding Milk ");
	}
}

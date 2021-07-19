package ch09;

public class Desktop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	//상위클래스 메서드를 재정의해도 된다.
	@Override
	public void turnOff() {
		System.out.println("Desktop TurnOff");
	}
}

package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();//run메소드를 사용하기 위해 업캐스팅
		aiCar.run();
		System.out.println("========================");
		Car mCar = new ManualCar();
		mCar.run();
	}
}

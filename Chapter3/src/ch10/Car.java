package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washcar() {}
	final public void run() { //추상,구현 상관없이 메서드를 부른다.
		startCar(); //차 시동키고
		drive();	//운전하고
		wipe(); 	//와이퍼로 닦아라.
		stop();		//멈추고
		turnOff();	//차 시동꺼라
	} //이 시나리오가 변하면 안된다.
}

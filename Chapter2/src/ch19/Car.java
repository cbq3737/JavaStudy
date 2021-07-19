package ch19;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		this.serialNum++;
		this.carNum = serialNum;//생성이 될 떄마다 serialNum이 하나씩 배당이 되어야 한
	}
	public int getCarNum() {
		return carNum;
	}
}

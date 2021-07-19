package ch14;

public class Bus {
	private int busNumber;
	private int passengerCount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	public void take(int money){ //학생이 take를 부르면서 돈을 준 것.
		this.money += money;	//이게 바로 협력이 되는 메서드
		this.passengerCount +=1;
	}
	public void showBusInfo() {
		System.out.println(this.busNumber+"번의 승객 수는"+this.passengerCount+" 명 이고, 수입은"+this.money+"입니다");
	}
}

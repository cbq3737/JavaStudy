package ch14;

public class Subway {
	private String lineNumber;
	private int passengerCount;
	private int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		this.passengerCount +=1;
	}
	public void showSubwayInfo() {
		System.out.println(this.lineNumber+"호선의 승객 수는"+this.passengerCount+" 명 이고, 수입은"+this.money+"입니다");
	}
}

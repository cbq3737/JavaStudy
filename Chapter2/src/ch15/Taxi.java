package ch15;

public class Taxi {
	private String name;
	private int money;
	
	public Taxi(String name,int money) {
		this.name = name;
		this.money = money;
	}
	public void take(int money) {
		this.money += money;
	}
	public void showTaxiInfo() {
		System.out.println(this.name+"택시 수입은"+this.money+"원 입니다.");
	}
}

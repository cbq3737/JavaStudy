package ch06;

public class GoldCustomer extends Customer{
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade ="GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}
	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		price = price - (int)(price * salesRatio);
		return price;
	}
}

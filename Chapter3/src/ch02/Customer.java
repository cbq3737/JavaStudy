package ch02;

public class Customer {
	private int customerID;
	private String customerName;
	protected String customerGrade;//상속에서 사용하기 위하여 
	int bonusPoint;
	double bonusRatio;

	public Customer() { //일반고객
		bonusRatio = 0.01;
		customerGrade = "SILVER";
	}
	public int calPrice(int Price){ //고객이 물건 살 때
		bonusPoint += Price * bonusRatio;
		return Price;
	}
	public String showCustomerInfo(){
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
}

package ch03;

public class VIPCustomer extends Customer{
//	private int customerID;	//상속을 받았으므로 없어도 된다.
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
	
	//일반 고객과 다르게 할인비율,담당 상담원이 있음
	double salesRatio; 
	private String agentID;
	
//	public VIPCustomer() {
//		
//		customerGrade="VIP";//Customer에 private으로 접근이 제한되었으므로 하위 클래스에서 접근이 가능하도록 protected로 바꿔준다.
//		salesRatio =0.1;
//		bonusRatio =0.05;
//		
//		System.out.println("VIP Customer() 호출");
//	}
	//기능을 추가하려다 보니 기능이 많이 구체화가 된다 -> 상속

	public VIPCustomer(int customerID,String customerName) {
		super(customerID,customerName);
		customerGrade="VIP";
		salesRatio =0.1;
		bonusRatio =0.05;
		System.out.println("VIP Customer(int,String) 호출");
	}
	
	public double getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
}

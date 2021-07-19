package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();

		Customer customerI = new Customer(10010,"Tomas");
		Customer customerJ = new Customer(10020,"James");
		Customer customerP = new GoldCustomer(10030,"Adward");
		Customer customerS = new GoldCustomer(10040,"Percy");
		Customer customerK = new VIPCustomer(10050,"Kim");
		
		customerList.add(customerI);
		customerList.add(customerJ);
		customerList.add(customerP);
		customerList.add(customerS);
		customerList.add(customerK);
	//세종류의 고객이 있지만 상위클래인Customer로 핸들링하고 Customer형인 배열에 넣는다.
//		for(Customer customer:customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		int price = 10000;
//		for(Customer customer:customerList) {
//			int cost = customer.calPrice(price);
//			System.out.println(customer.getCustomerName()+"님의 "+cost+"원 지불하셨습니다.");
//			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+" 입니다.");
//		}
		if(customerP instanceof VIPCustomer) {
			VIPCustomer vc =(VIPCustomer)customerP;
			System.out.println(vc.showCustomerInfo());
		}

		
	}
}

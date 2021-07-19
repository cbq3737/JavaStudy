package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
	
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());//상속받은 메서드
	
		Customer customer = new VIPCustomer(20020,"noname");
	
	}
}

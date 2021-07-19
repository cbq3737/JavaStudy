package ch08;

public class Order {

	private String orderNumb;
	private int orderPhone;
	private String address;
	private int orderDate;
	private int orderTime;
	private int orderPrice;
	private String menuNumb;
	
	public Order(String orderNumb,int orderPhone,String address,int orderTime,int orderDate,int orderPrice,String menuNumb) {
		this.orderNumb = orderNumb;
		this.orderPhone= orderPhone;
		this.address = address;
		this.orderDate= orderDate;
		this.orderTime = orderTime;
		this.orderPrice= orderPrice;
		this.menuNumb = menuNumb;
	}
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : "+orderNumb);
		System.out.println("주문 핸드폰 번호: "+orderPhone);
		System.out.println("주문 집 주소 : "+address);
		System.out.println("주문 날짜: "+orderDate);
		System.out.println("주문 시간: "+orderTime);
		System.out.println("주문 가격: "+orderPrice);
		System.out.println("메뉴 번호: "+menuNumb);
	}
}

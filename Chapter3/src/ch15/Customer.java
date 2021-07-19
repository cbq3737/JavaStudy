package ch15;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}
	@Override
	public void buy() {
		System.out.println("customer buy");
	}
	//Buy,Sell모두에 order라는 디폴트 메서드가 중복이되기떄문에 재정의를 해줘야한다.
	//두 인터페이스를 상속받기에 둘 중 하나를 선택하던가 아니면 재정의를 해라
	@Override
	public void order() {
		System.out.println("customer order");
	}
	public void hello() {
		System.out.println("hello");
	}
}

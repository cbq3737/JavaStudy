package ch08;

import java.util.ArrayList;

public class TravelCustomerTest {
	public static void main(String[] args) {
		ArrayList<TravelCustomer> arrayList = new ArrayList<>();
		
		TravelCustomer customerLee = new TravelCustomer("이순신",40,100);
		TravelCustomer customerKim = new TravelCustomer("김유신",20,100);
		TravelCustomer customerHong = new TravelCustomer("홍길동",13,50);
		
		arrayList.add(customerLee);
		arrayList.add(customerKim);
		arrayList.add(customerHong);
		
		//고객명단 출력
		System.out.println("고객 명단 출력");
		arrayList.stream().map(n->n.getName()).forEach(s -> System.out.println(s));
		
		//여행의 총비용 계산 , map만 사용하면 객체를 갖고오게 됨으로
		System.out.println("여행의 총 비용");
		System.out.println(arrayList.stream().mapToInt(s->s.getPrice()).sum());
		
		//고객 중 20세 이상인 사람만 출력
		System.out.println("고객중 20세 이상만 출력");
		arrayList.stream().filter(s->s.getAge() >=20 ).map(l->l.getName()).sorted().forEach(n -> System.out.println(n));
	}
}

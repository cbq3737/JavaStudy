package ch08;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order("2002011020003",01023450001,"서울시 강남구 역삼동 111-333",20201102,130258,35000,"0003");
		Person person = new Person(180,78,"남성","Tomas",37);
		
		order.showOrderInfo();
		System.out.println(person.showPersonInfo());
	}

}

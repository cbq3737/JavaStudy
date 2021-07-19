package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();  
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		//컬렉션에 대한 스트림에 대한 스트림을 생성하면 제네릭형으로 생성한다.
		//컬렉션들은 모두 스트림으로 호출할 수 있다.
		Stream<String> st = sList.stream();
		st.forEach(s->{System.out.println(s);});
	
		//재생성
		st = sList.stream();
		//정렬한 뒤에 출력
		st.sorted().forEach(s->{System.out.print(s+"\t");});
		System.out.println();
		
		//재생성
		st = sList.stream();
		//string의 길이를 출력,객체 자체에 대한 메서드를 이용할 때는 map을 사용하면 된다.
		st.map(s->s.length()).forEach(n->{System.out.print(n+"\t");});
		
		//재생성
		st = sList.stream();
		st.filter(s -> s.length()>=5).forEach(n->{System.out.print(n+"\t");});		
	}
}

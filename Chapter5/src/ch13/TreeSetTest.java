package ch13;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet();
		set.add("홍길동");
		set.add("강감찬");  //안에 이진트리로 되어있기 때문에 순서가 문제가 아니라 정렬이 되어서 나온다.
		set.add("이순신");
		System.out.println(set);
	}
}

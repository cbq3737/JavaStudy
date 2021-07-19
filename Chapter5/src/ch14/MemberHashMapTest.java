package ch14;

import java.util.HashMap;

import ch14.Member;
import ch14.MemberHashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {	

		Member memberHong = new Member(1004,"홍길동");
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		
		MemberHashMap memberhashMap = new MemberHashMap();
	
		memberhashMap.addMember(memberHong);
		memberhashMap.addMember(memberLee);
		memberhashMap.addMember(memberKim);
		memberhashMap.addMember(memberKang);
		
//		memberhashMap.showAllMember();
		
		HashMap<Integer, String> hashmap = new HashMap();
		hashmap.put(1,"kim");
		hashmap.put(2,"Lee");
		hashmap.put(3,"Kang");
		hashmap.put(4,"Hong");
		
		System.out.println(hashmap.toString());

		
	}

}

package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer,Member> hashmap;
	public MemberHashMap() {
		hashmap = new HashMap<>();
	}
	public void addMember(Member member) {
		hashmap.put(member.getMemberId(),member);	
	}
	public boolean removeMember(int memberId) {
		if(hashmap.containsKey(memberId)) {
			hashmap.remove(memberId);
			return true;
		}
		System.out.println("no element");
		return false;
	}
	public void showAllMember() {
		//Map인터페이스는 iterator를가져올 수 있는 방법은 없고, 
		//key에서 갖고올꺼냐 value에서 갖고올꺼냐 중 고르면 된다.
		//key로 갖고왔으니 Integer
		Iterator<Integer> ir = hashmap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashmap.get(key);
			System.out.println(member);
		}
		//이렇게 안하고 hashmap으로 출력해도 key,value pair로 나온다.
	}
}

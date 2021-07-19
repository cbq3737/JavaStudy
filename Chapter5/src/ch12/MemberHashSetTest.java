package ch12;

import ch12.Member;
import ch12.MemberHashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
	
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		
		MemberHashSet memberhashSet = new MemberHashSet();
		
		memberhashSet.addMember(memberLee);
		memberhashSet.addMember(memberKim);
		memberhashSet.addMember(memberKang);
		
		Member memberHong = new Member(1003,"홍길동");
		memberhashSet.addMember(memberHong);
		
		memberhashSet.ShowAllMember();
	}

}

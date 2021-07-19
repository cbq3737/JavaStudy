package ch13;

import ch13.Member;
import ch13.MemberTreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {	

		Member memberHong = new Member(1004,"홍길동");
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		
		MemberTreeSet membertreeSet = new MemberTreeSet();
	
		membertreeSet.addMember(memberHong);
		membertreeSet.addMember(memberLee);
		membertreeSet.addMember(memberKim);
		membertreeSet.addMember(memberKang);
		
		
		membertreeSet.ShowAllMember();
	}

}

package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		Member memberHong = new Member(1004,"홍길동");
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.ShowAllMember();
		memberArrayList.removeMember(1002);
		memberArrayList.ShowAllMember();

	}
}

package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i=0;i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			if(member.getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지않습니다.");
		return false;
	}
	
	public void ShowAllMember() {
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println();
	}
}

package ch16.interfaceProgramm;

import java.util.ArrayList;

public class RoundRobin implements Scheduler {
	private ArrayList<Call> arraylist;
	
	public RoundRobin() {
		arraylist = new ArrayList<>();
	}
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져온다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서의 상담원에게 분배한다.");
	}

}

package ch16.interfaceProgramm;

import java.io.IOException;
import java.util.Scanner;


public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담원 할당 방식을 선택하세요");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");
		 
		Scheduler scheduler = null;
		int ch = System.in.read(); //문자하나만 입력받을 시에는 System.in.read 많이 사용
		//Scanner sc = new Scanner(System.in);
		//char ch = sc.next().charAt(0); //문자하나만 입력받을 시 
		if(ch == 'R' || ch =='r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch =='l') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("input error");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}

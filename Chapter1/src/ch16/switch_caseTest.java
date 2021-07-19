package ch16;

import java.util.Scanner;

public class switch_caseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이번달: ");
		month = scanner.nextInt();

		int day;
		switch (month) {
		case 1:case 3:case 5:case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:case 6: case 9: case 11:
			day = 30;
			break;
	
		default:
			System.out.println("잘못입력하였습니다.");
			day = -1;
			break;
		}
		System.out.println(month + "월 달은" + day + "일 입니다.");
	}
}

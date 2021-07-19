package ch14;

import java.util.Scanner;

public class If_elseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int age = 7;
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이: ");
		int age = scanner.nextInt();

		if (age >= 8) {
			System.out.println("go to school");
		} else {
			System.out.println("so young");
		}
	}

}

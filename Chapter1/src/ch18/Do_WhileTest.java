package ch18;

import java.util.Scanner;

public class Do_WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum =0;
		
		do {
			input =scanner.nextInt();
			sum += input;
		}while(input != 0);
		System.out.println(sum);
	}
}

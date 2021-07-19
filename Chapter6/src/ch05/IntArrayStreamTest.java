package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		//is를 또 못사용한다.
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}
}

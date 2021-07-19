package ch20;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int total = 0;
		int num = 1;
		for(int i=0;i<arr.length;i++) {
			arr[i] = num++;
		}
		for(int numb:arr) { //enhance for문 ,처음부터 끝까지 쓸 때 사용
			total+= numb;
		}
		System.out.println(total);
	}
}

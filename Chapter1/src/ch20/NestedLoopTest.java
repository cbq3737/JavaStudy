package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dan;
//		int count = 1;
//		for (dan=2; dan <= 9; dan++) {
//			for (count = 1; count <= 9; count++) {
//				System.out.println(dan+"x"+count+"="+dan*count);
//			}
//		}
//		System.out.println();

		int dan = 2;
		int count = 1;
		while (dan <= 9) {
			count =1;
			while (count <= 9) {
				System.out.println(dan+"x"+count+"="+dan*count);
				count ++;
			}
			dan++;
		}
	}
}

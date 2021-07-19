package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		//큐타입으로 이루어져있으니 큐로 선언
		Queue que = new BookShelf();
		
		que.enQueue("토지1");
		que.enQueue("토지2");
		que.enQueue("토지3");
		que.enQueue("토지4");
		que.enQueue("토지5");
		
		System.out.println(que.getSize());
		System.out.println(que.deQueue());
		System.out.println(que.deQueue());
	}

}

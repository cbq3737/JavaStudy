package ch04;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack mystack = new MyStack(3);
		mystack.push(10);
		mystack.push(20);
		mystack.push(30);
		mystack.push(40);

		mystack.printAll();
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.peek());
	}

}

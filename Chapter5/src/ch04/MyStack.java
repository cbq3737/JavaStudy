package ch04;

import ch02.MyArray;

public class MyStack {
	MyArray myarray ;
	private int top;
	
	public MyStack() {
		top = 0;
		myarray = new MyArray();
	}
	public MyStack(int size) {
		top=0;
		myarray=  new MyArray(size);
	}
	public void push(int data) { //data를 넣기전 꽉 찼는지 확인을 한다.
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		else {
			myarray.addElement(data);
			top++;
		}
	}
	//꺼낼때는 top-1 위치에서 꺼낸다.
	public int pop() { //비었는지 확인
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return myarray.ERROR_NUM;
		}
		else {
			return myarray.removeElement(--top); //top보다 하나 작은데서 빼준다. 
		}
	}
	public int peek() {//꺼내는게 아니라 그 position에 있는 element를 반환
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return myarray.ERROR_NUM;
		}
		else {
			return myarray.getElement(--top); 
		}
	}
	public void printAll() {
		myarray.printAll();
	}
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		else return false;
	}
	public boolean isFull() {
		if(top == myarray.ARRAY_SIZE) { //꽉찻다.
			return true;
		}
		else return false;
	}
}

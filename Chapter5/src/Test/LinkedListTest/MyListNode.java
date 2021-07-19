package Test.LinkedListTest;

public class MyListNode {
	private String data;
	public MyListNode next;
	
	public MyListNode() {
		this.data = null;
		this.next = null;
	}
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	public MyListNode(String data,MyListNode nextNode) {
		this.data = data;
		this.next = nextNode;
	}
	public String getData() {
		return this.data;
	}
}

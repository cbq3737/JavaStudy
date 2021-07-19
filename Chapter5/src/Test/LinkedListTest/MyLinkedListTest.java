package Test.LinkedListTest;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList mylist = new MyLinkedList();
		mylist.addElement("AA");
		mylist.addElement("BB");
		mylist.addElement("CC");
		mylist.printAll();
		mylist.removeElement(1);
		mylist.printAll();
		mylist.insertElement(1, "DD");
		mylist.printAll();
	}
}

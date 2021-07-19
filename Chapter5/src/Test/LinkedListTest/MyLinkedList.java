package Test.LinkedListTest;

import java.net.StandardSocketOptions;

public class MyLinkedList {

	private MyListNode head;
	int count; // 노드의 갯수

	public MyLinkedList() {
		head = null;
		count = 0;
	}

	public MyListNode addElement(String data) {
		MyListNode newNode;

		if (head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		} else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}

	public MyListNode insertElement(int position, String data) {
		MyListNode tempNode = head;//노드를 타고 가기위함으로 head를 먼저 설정해준다.
		MyListNode preNode = null;
		MyListNode newNode = new MyListNode(data);
		if (position < 0 || position > count) {
			System.out.println("위치가 알맞지 않습니다.");
			return null;
		} else if (position == 0) {
			newNode.next = tempNode;// tempNode는 head를 가르키므로
			head = newNode;
//			tempNode = newNode; 이게 말이안되는 이유는 tempNode는 head의 이름을 빌린것뿐,이러면 tempNode에 newNode가 또 들어온것뿐.
		} else {
			for (int i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
//			preNode.next = newNode; //이순서로 되면 기존 prenode의 next는 newnode고
//			newNode.next = preNode.next; //newnode의 next는 현재 prenode의 next가 newnode를 가르키기에 newnode를 계속 가르킨다.
		}
		count++;
		return newNode;
	}

	public MyListNode removeElement(int position) {
		MyListNode tempNode = head;
		MyListNode preNode = null;
		if(position == 0) {
			head = tempNode.next;
		}
		else {
			for(int i=0;i<position;i++) {
				preNode= tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;//리턴으로 삭제되는 노드
	}
	public String getElement(int position) {
		MyListNode tempNode = head;
		if(position >= count) {
			System.out.println("검색오류입니다.");
			return "error";
		}
		if(position ==0) {
			return tempNode.getData();
		}
		else {
			for(int i=0;i<position;i++) {
				tempNode = tempNode.next;
			}
			return tempNode.getData();
		}
	}
	public boolean isEmpty() {
		if(head == null) {
			return false;
		}
		else {
			return true;
		}
	}
	public void printAll() {
		MyListNode tempNode = head;
		if(count ==0) {
			System.out.println("출력할 내용이없음");
		}
		while(tempNode != null) {
			System.out.print(tempNode.getData());
			tempNode = tempNode.next;
			if(tempNode != null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}
}

package ch05;

import ch03.MyLinkedList;
import ch03.MyListNode;

interface Queue {
	public void enQueue(String data);

	public String deQueue();

	public void printQueue();
}

//기존에 만들어놨던 연결리스트 상속받아옴.
public class MyLinkedQueue extends MyLinkedList implements Queue {

	MyListNode front;//맨 앞
	MyListNode rear;//맨 뒤

	@Override // 맨뒤로 들어감.
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) { //우선 큐가 비었는지 먼저 검사한다.맨 처음
			newNode = addElement(data); //반환되는 값이 newNode이므로 
			front = newNode;//맨 처음
			rear = newNode;//맨처음 할당
		}
		else {
			newNode = addElement(data);
			rear = newNode;//맨 뒤
		}
		System.out.println(newNode.getData()+" added");//어떤게 추가가 되었는지 출력을 해주는 코드.
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {//비었으면 아무것도 못주므로 error를 출력
			return null;
		}
		String data = front.getData();//맨앞에 있는 데이터 빼주고
		front = front.next;//앞에 것이 나갔으므로 그 뒤 데이터를 가르킨다.
		if(front == null) {//front의 next를 가르키는데 front가 null이면
			rear = null;//그러면 마지막 항목 역시 null이라는 의미다. 
		}
		return data;
	}

	@Override
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		printAll();
	}

}

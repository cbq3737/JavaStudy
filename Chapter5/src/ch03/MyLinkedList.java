package ch03;

public class MyLinkedList {
	private MyListNode head; // 노드 맨처음 앞 부분
	int count;

	public MyLinkedList() {
		head = null; // 맨처음 head는 비어있고,
		count = 0;// 아직 갯수는 없음.
	}

	public MyListNode addElement(String data) {

		MyListNode newNode;
		if (head == null) { // 맨 처음 노드를 생성할 떄
			newNode = new MyListNode(data);
			head = newNode;
		} else {
			newNode = new MyListNode(data);
			MyListNode temp = head;// head를 temp로 부르고
			while (temp.next != null) { // 그 head의 next 링크가 없을때까지
				temp = temp.next;
			}
			temp.next = newNode; // head의 next를 새로 생긴 Node로 지정해준다.
		}
		count++;// 갯수가 하나 늘고
		return newNode;
	}

	public MyListNode insertElement(int position, String data) {
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);

		if (position < 0 || position > count) {
			System.out.println("추가 할 위치 오류입니다.현재 리스트의 개수는" + count + "입니다.");
			return null;
		}
		if (position == 0) { // 맨 앞에 위치한다면
			newNode.next = tempNode;// 새로운 애의 next가 기존의 head,tempNode에 head가 들어있기에
			head = newNode; // 새로운 애가 head가 됌.
		} else {
			MyListNode preNode = null;
			for (int i = 0; i < position; i++) {// 그 position위치까지 쭉 반복문을 돌림
				preNode = tempNode;// tempnode가 prenode가 됨.
				tempNode = tempNode.next;// tempnode의 위치를 뒤로 보냄.
			}
			newNode.next = preNode.next;// 이때 newnode의 다음이 기존 prenode의 다음을 가르킴.
			preNode.next = newNode;// 앞에 있던 prenode의 다음이 newnode를 가르킴.
		}
		count++; // 하나 들어왔으므로 count
		return newNode;
	}

	public MyListNode removeElement(int position) {
		MyListNode tempNode = head;
		if (position >= count) { // 뺄 위치가 노드 총 개수보다 크면 말이 안됨.
			System.out.println("삭제할 위치 오류입니다.현재 리스트의 개수는" + count + "개 입니다.");
			return null;
		}
		if (position == 0) {// 맨 앞이라면 맨 앞이 가르키던 애가 head가 됨.
			head = tempNode.next;
		} else {
			MyListNode preNode = null;
			for (int i = 0; i < position; i++) {
				preNode = tempNode;// insert하는것처럼 계속 다음 노드로 넘어감.
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next; // 앞에 노드의 next가 기존 tempnode가 가르킨 next가 됨. 고로 기존 노드는 무시됨.
		}
		count--; // 뺏으니까 개수도 하나 빼줌.
		System.out.println(position + "번째 항목 삭제되었습니다.");

		return tempNode;
	}

	public String getElement(int position) {
		MyListNode tempNode = head;
		if (position >= count) {
			System.out.println("검색위치 오류입니다.현재 리스트의 개수는" + count + "개 입니다.");
			return new String("error");
		}
		if (position == 0) {// 맨 인 경우
			return head.getData();
		}
		for (int i = 0; i < position; i++) {
			tempNode = tempNode.next;// 그 위치까지 움직이는 코드
		}
		return tempNode.getData();// 그 노드의 데이터를 줌.
	}

	public MyListNode getNode(int position) {
		MyListNode tempNode = head;
		if (position >= count) {
			System.out.println("검색 위치 오류입니다.현재 리스트의 개수는" + count + "개 입니다.");
			return null;
		}
		if (position == 0) {
			return head;
		}
		for (int i = 0; i < position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode; // 노드 자체를 반환함.
	}
	public int getSize() {
		return count;
	}
	public void removeAll() {// head비우고 count도 0으로 만들어버림.
		head = null;
		count = 0;
	}

	public void printAll() {
		if (count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		MyListNode temp = head;
		while (temp != null) {
			System.out.print(temp.getData()); // 데이터 출력
			temp = temp.next; // 다음 노드로 이동
			if (temp != null) {
				System.out.print("->");// 이동할때 -> 출력
			}
		}
		System.out.println("");
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
}

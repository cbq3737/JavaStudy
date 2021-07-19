package ch15;

public interface Queue {
	
	void enQueue(String title);
	String deQueue();//책의 이름을 반환해준다.
	int getSize(); //안에 몇개있는지 반환
}

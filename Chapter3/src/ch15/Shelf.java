package ch15;

import java.util.ArrayList;

public class Shelf {
	//상속을 받기위해 protected로, 같은 패키지내에서 사용하기 위해
	protected ArrayList<String> shelf;
	//생성자를 호출할 때 변수들을 초기화하는것이 제일 좋다.
	public Shelf() {
		shelf = new ArrayList<>();
		
	}
	public ArrayList<String> getShelf(){
		return shelf;
	}
	//얘가 가진 물건의 갯수를 반환하는 메서드
	public int getCount() {
		return shelf.size();
	}
}

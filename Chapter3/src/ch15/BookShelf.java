package ch15;

public class BookShelf extends Shelf implements Queue{
	
	@Override
	public void enQueue(String title) {
		shelf.add(title); //protected로 선언한 배열
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}//remove라는 메서드는 인덱스번호를 주면 반환해주는 애

	@Override
	public int getSize() {
		return getCount();
	}

}

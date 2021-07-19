package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>(); //1.5 ,5.0부터 어떤 객체를 넣을 것이냐, 지정을 안할 수도 있다.
		//필요하면 알아서 배열의 개수를 늘린다. 
		library.add(new Book("태백산맥1","조정래"));
		library.add(new Book("태백산맥2","조정래"));
		library.add(new Book("태백산맥3","조정래"));
		library.add(new Book("태백산맥4","조정래"));
		library.add(new Book("태백산맥5","조정래"));
		
		for(int i=0;i<library.size();i++) {
			library.get(i).showInfo();
		}
		
	}
}

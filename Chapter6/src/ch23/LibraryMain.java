package ch23;

import java.util.ArrayList;
//도서관이기때문에 공유 자원
class FastLibrary{
	public ArrayList<String> shelf = new ArrayList<>();
	public FastLibrary() {
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
	}
	
	// 책을 빌려간다.
	public synchronized String lentBook() throws InterruptedException {
		//이 메서드를 수행하는 쓰레드의 정보
		Thread t = Thread.currentThread();
		while(shelf.size() == 0 ) {
			//wait은 Object의 메서드임 -> 그러므로 그냥 써도 됨.
			System.out.println(t.getName()+" wating start");
			wait();
			System.out.println(t.getName()+" wait end");
		}
		//맨 앞에 있는 책을 빌린다.
		if(shelf.size()>0) {
			String book = shelf.remove(0);
			System.out.println(t.getName()+" : "+ book +" lent ");
			return book;	
		}
		else return null;
	}
	
	//책반납
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		//책을 새로 넣고 나서 notify날려줌.
		notifyAll();
		System.out.println(t.getName()+" : "+ book +" return ");

	}
}
class Student extends Thread{
	
	public Student(String name) {
		super(name);
	}
	public void run() {
		try {
			//빌림
			String title =LibraryMain.library.lentBook();
			//잘못 빌렸으면 그냥 return 
			if(title == null) {
				System.out.println("빌리지 못했음");
			}
			//빌리고 나서 읽는 시간
			Thread.sleep(5000);
			//반납
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class LibraryMain {
	public static FastLibrary library = new FastLibrary();
	public static void main(String[] args) {
		Student st1 = new Student("st1");
		Student st2 = new Student("st2");
		Student st3 = new Student("st3");
		Student st4 = new Student("st4");
		Student st5 = new Student("st5");
		Student st6 = new Student("st6");
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();
	}
}

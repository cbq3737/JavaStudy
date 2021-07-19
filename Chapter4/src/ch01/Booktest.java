package ch01;

class Book{
	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title+","+author;
	}
}
public class Booktest {

	public static void main(String[] args) {
		Book book = new Book("데미안","헤르만 헤세");
		System.out.println(book);
		//객체에 대한 정보를 표현할때 toSring을 많이 override해서 쓴다.
		String str= new String("test");
		System.out.println(str.toString());
	}
}

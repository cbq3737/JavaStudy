package ch02;

class OutClass2 {
	
	int outNum = 100; //멤버변수,원래는 생성자에서 해주는게 좋다.
	static int sNum = 200;
	
//	Runnable getRunnable(int i) { // runnable타입을 만든다.
//			int num =10; //로컬 변수
//			
//			return new Runnable() {
//			int localNum = 1000; 
//			@Override
//			public void run() { 
//				
//				System.out.println("i -"+i+"(getRunnable 매개변수)");//매개변수는 메서드가 호출될 때 스택메모리에 생성이된다.
//				System.out.println("num = "+num+"(getRunnable 지역변수)");
//				System.out.println("localNum = "+localNum+"(내부 클래스 지역변수)");
//						
//				System.out.println("outNum = "+outNum+"(외부클래스 인스턴스 변수)");
//				System.out.println("OutClass.sNum = "+OutClass2.sNum+"(외부클래스 정적 변수)");
//			}
//		};
//	}
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runable class");
			
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		OutClass2 out = new OutClass2();
//		Runnable runner = out.getRunnable(100);
//		runner.run();
		//getRunnable이 호출되서 클래스를 반환하면 이 메서드는 끝이남.스택에 있었으면 메서드 호출이 끝난순간 없어짐
		//근데 얘네들이 runner.run으로 불린다. 얘네를 상수화한다. 값을 가져다 쓸 순 있지만 변경은 안된다.
		out.runnable.run();
		
	}
}

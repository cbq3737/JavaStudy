package ch20;

class MyThread implements Runnable{

	@Override
	public void run() {
		int i ;
		for(i=1;i<=200;i++) {
			System.out.print(i + "\t");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		//메인에서 돌아가고 있는 쓰레드가 어떤 쓰레드인지 확인하기 위해 사용
		System.out.println(Thread.currentThread()+"start");
		
		MyThread runnable = new MyThread();
	
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread()+"end");
	
//		//익명 inner 클래스 
//		Runnable inner  = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("run");
//			}
//			
//		};
//		inner.run();
	}
}

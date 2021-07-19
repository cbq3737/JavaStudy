package ch09;

public class AutoCloseableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoClosableObj obj = new AutoClosableObj();
		
		try(obj){//obj를 쓰겠다라고 선언함.
			throw new Exception();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}

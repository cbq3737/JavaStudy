package ch09;

public class AutoClosableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("closing....");
	}

}

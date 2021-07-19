package ch21;

public class JoinTest  extends Thread{
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start= start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start;i<=end;i++) {
			total += i;
		}
	}

	public static void main(String[] args) {
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		//main에서 join을 거는 것.
		//얘네가 안끝나면 main을 깨워야하므로 interrupt를 날린다.
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int last_total = jt1.total + jt2.total;
		System.out.println(jt1.total);
		System.out.println(jt2.total);
		System.out.println(last_total);
	}
}

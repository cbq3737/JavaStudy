package ch18;

public class Company { 
	private static Company instance = new Company();//유일한 객체,인스턴스
	
	private Company() {
		
	}
	//외부에서 사용할 수 있도록 하기위해 public으로 get 생성
	public static Company getinstance() {//반환 함수,생성자x
		if(instance == null) {
			instance = new Company(); //방어적인 코드
		}
		return instance; 
	}
}

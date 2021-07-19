package ch11;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int devide(int num1, int num2) {
		if(num2 ==0 ) {
			return ERROR;
		}
		else {
			return num1 / num2;	
		}
	}
	//별개로의 각자 메서드
	public void showInfo() {
		System.out.println("모두 구현하였습니다.");
	}
}

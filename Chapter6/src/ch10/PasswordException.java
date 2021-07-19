package ch10;

//파라미터가 잘못들어온 경우 발생하는 예외
public class PasswordException extends Exception {
	//이 예외가 생성될 때 들어온 메세지를 상위 클래스로 던져줌
	public PasswordException(String message) {
		super(message);
	}
}

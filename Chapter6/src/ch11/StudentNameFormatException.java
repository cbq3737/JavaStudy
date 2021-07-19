package ch11;
//원래는 Exception으로 상속을 받지만 Illegal로 해야지 throws를 하지않아도 됨.
public class StudentNameFormatException extends IllegalArgumentException {
	public StudentNameFormatException(String message){
		super(message);
	}
}

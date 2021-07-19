package ch10;

public class PasswordTest {

	private String password;

	public String getPassword() {
		return password;
	}								//setter는 PasswordException을 발생시킨다.
	public void setPassword(String password) throws PasswordException {
		if(password == null) {
			throw new PasswordException("비밀번호가 null이면 안됩니다.");
		}
		else if(password.length() <5) {
			throw new PasswordException("비밀번호가 5자이상이어야 합니다.");
		}
		//string을 포함하느냐 a부터 z,A부터Z가 한번 이상 반복되느냐 
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		//그렇지않다면 password는 password일뿐
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("예외처리없이 실행");
		} catch (PasswordException e) {
				System.out.println(e.getMessage());
		}
		
		password = "abc";
		try {
			test.setPassword(password);
			System.out.println("예외처리없이 실행");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("예외처리없이 실행");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde!!##";
		try {
			test.setPassword(password);
			System.out.println("예외처리없이 실행");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}

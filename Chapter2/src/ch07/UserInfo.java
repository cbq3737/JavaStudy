package ch07;

public class UserInfo {
	
	private String userid;
	private String userPassword;
	private String userName;
	
	public UserInfo() {	}
	public UserInfo(String userid,String userPassword,String userName) {
		this.userid = userid;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	public String showUserInfo() {
		return "고객님의 아이디는"+userid+"이고, 등록된 비밀번호는 "+userPassword+
				" 이고, 이름은" +userName;
	}
}

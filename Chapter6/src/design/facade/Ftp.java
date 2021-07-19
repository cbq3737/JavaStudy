package design.facade;

public class Ftp {
	//ftp가 특정한 port22에 특정한 host에 붙을 것이다.
	private String host;
	private int port;
	private String path;
	
	public Ftp(String host,int port, String path) {
		this.host = host;
		this.port = port;
		this.path = path;
	}
	
	public void connect() {
		System.out.println("FTP Host는"+host+" Port : "+port+"로 연결합니다.");
	}
	public void moveDirectory() {
		System.out.println("path: "+path+"로 이동합니다.");
	}
	public void disconnect() {
		System.out.println("FTP 연결을 종료합니다.");
	}
}

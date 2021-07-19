package design.facade;

public class SftpClient {
	//모든 의존성을 얘가 가져가 버린다.
	private Ftp ftp;
	private Reader reader;
	private Writer writer;
	public SftpClient(Ftp ftp,Reader reader,Writer writer) {
		this.ftp = ftp;
		this.reader = reader;
		this.writer = writer;
	}
	//오버로딩 = 얘로 인해서 얘네 모두 다 생성가능하다. 이렇게 객체를 감쌈으로써 의존성을 SftpCliet가 모두 가져갔고, 새로운 인터페이스를 제공한다.
	public SftpClient(String host, int port, String path,String fileName) {
		this.ftp = new Ftp(host,port,path);
		this.reader = new Reader(fileName);
		this.writer = new Writer(fileName);
	}
	
	public void connect() {
		ftp.connect();
		ftp.moveDirectory();
		writer.fileConnect();
		reader.fileConnect();
	}
	public void disconnect() {
		writer.fileDisConnect();
		reader.fileDisConnect();
		ftp.disconnect();
	}
	public void read() {
		reader.fileRead();
	}
	public void writer() {
		writer.write();
	}
}

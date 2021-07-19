package design.singleton;

public class BClass {
	private SocketClient socketclient;
	
	public BClass() {
		this.socketclient = socketclient.getInstance();	
	}
	
	public SocketClient getSocketClient() {
		return this.socketclient;
	}
}

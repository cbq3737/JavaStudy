package design.singleton;

public class Aclass {
	private SocketClient socketclient;
	
	public Aclass() {
		this.socketclient = socketclient.getInstance();	
	}
	
	public SocketClient getSocketClient() {
		return this.socketclient;
	}
}

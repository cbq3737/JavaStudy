package design.adapter;
//얘는 110V로 받은 후 220으로 변경해줘야하기 떄문에 기본적으로 110V를 받는다. 
public class SocketAdapter implements Electronic110V{
	private Electronic220V electronic220v;
	//기본 생성자로 220V를 받고 할당한다. 
	public SocketAdapter(Electronic220V electronic220v) {
		this.electronic220v = electronic220v;
	}
	
	//실질적으로 220v의 connect를 대신 호출해준다.
	@Override
	public void powerOn() {
		electronic220v.connect();
	}
}

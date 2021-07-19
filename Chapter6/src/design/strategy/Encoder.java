package design.strategy;

public class Encoder {
	private EncodingStrategy encodingStrategy;
	
	//이렇게 message받은것을 EncodingStrategy의 encode로 반환해주면 각각의 전략에 따라서 결과가 달라진다.
	public String getMessage(String message) {
		return this.encodingStrategy.encode(message);
	}
	
	public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
		this.encodingStrategy = encodingStrategy;
	}
}

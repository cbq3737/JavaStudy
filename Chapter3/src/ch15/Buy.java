package ch15;

public interface Buy {
	public void buy();
	
	default void order() {
		System.out.println("Buy order");
	}
}

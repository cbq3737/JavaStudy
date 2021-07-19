package design.observer;

public class Button {
	private String name;
	private IButtonListener buttonListener;

	public Button(String name) {
		this.name = name;
	}

	// click이 일어나면 message를 이벤트에 던져주겠다.
	public void click(String message) {
		buttonListener.clickEvent(message);
	}
	
	public void addListener(IButtonListener iButtonListener) {
		this.buttonListener = iButtonListener;
	}
}

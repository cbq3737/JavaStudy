package ch16.templatemethod;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump못하지롱");
	}

	@Override
	public void turn() {
		System.out.println("turn못하지롱");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*******초급자 레벨입니다.*******");
	}
	

}

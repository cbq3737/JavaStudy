package ch19;
//decorator는 혼자쓸일이 없고, 상속받아서 사용하는 상위 클래스이므로 abstract로 생성
public abstract class Decorator extends Coffee{
	
	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		//자기가 인자로 받은 coffee가 제조하도록.
		coffee.brewing();
	}
}

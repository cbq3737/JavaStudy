package ch08;

public class Person {
	private int height;
	private int weight;
	private String gender;
	private String Name;
	private int age;
	
	public Person(int height,int weight,String gender,String Name,int age){	
		this.height=height;
		this.weight=weight;
		this.gender=gender;
		this.Name=Name;
		this.age=age;
	}
	public String showPersonInfo() {
		return "키가 "+height+"이고 몸무게가"+weight+" 킬로인"+gender+" 가 있습니다. 이름은"
				+Name+" 이고 나이는 "+age+" 입니다.";
	}
}

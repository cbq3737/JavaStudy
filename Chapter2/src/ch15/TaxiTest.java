package ch15;

public class TaxiTest {
	public static void main(String args[]) {
		
		Person person = new Person("Edward",20000);
		
		Taxi taxi1 = new Taxi("잘나간다 운수",0);
		
		person.takeTaxi(taxi1);
		person.showPersonInfo();
		taxi1.showTaxiInfo();
	}
}

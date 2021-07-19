package ch14;

public class TransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentJ = new Student("James",5000);
		Student studentT = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		studentJ.takeBus(bus100);
		Subway subwayG = new Subway("초록색");
		studentT.takeSubway(subwayG);
		
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		subwayG.showSubwayInfo();
	}

}

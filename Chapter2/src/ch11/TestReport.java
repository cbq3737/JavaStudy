package ch11;

public class TestReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeReport makereport = new MakeReport();
		String builder  = makereport.getReport();
		
		System.out.println(builder);
	}
}

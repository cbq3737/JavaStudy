package ch11;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLogger myLogger = MyLogger.getLogger();
		
		String name = null;
		try{
			Student student = new Student(name);
			
		}catch( StudentNameFormatException e ){
			myLogger.warning(e.getMessage());
		}
		
		try{
			Student student = new Student("Edward Jon Kim Test");
		}catch ( StudentNameFormatException e){
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student("James");
		student.getStudentName();
	}

}

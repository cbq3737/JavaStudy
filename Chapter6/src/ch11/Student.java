package ch11;

public class Student {
	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	//생성자는 throws를 안한다. 
	public Student(String studentName) {

		if (studentName == null) { //이름이 null인경우 
			throw new StudentNameFormatException("name must not be null");
		}
		if (studentName.split(" ").length > 3) //이름이 너무 긴 경우
			throw new StudentNameFormatException("이름이 너무 길어요");

		this.studentName = studentName;
	}

	public String getStudentName() {

		myLogger.fine("begin getStudentName()");

		return studentName;
	}

}

package ch09;

public class Student {
	private int studentId;
	private String studentName;
	
	Subject korea; //선언만 된 상황 
	Subject math;
	
	public Student(int studentId,String studentName) {
		this.studentId= studentId;
		this.studentName= studentName;
		
		korea = new Subject();//참조변수로 생성을 할 때 생성자에서 많이 생성한다.
		math = new Subject();
	}
	
	public void setKoreaSubject(String name,int score) {
		korea.setSubject(name, score);
	}
	public void setMathSubject(String name,int score) {
		math.setSubject(name, score);
	}
	public void showScore() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName+" 학생의 총점은 "+total+" 점 입니다.");
	}
}

package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();//인스턴스 생성
		student.studentId =12345;
		student.setStudentName("Lee");
		student.address="서울시 강남구";
		
		student.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId=22222;
		studentKim.studentName="Kim";
		studentKim.address = "서울시 강북구";
		
		studentKim.showStudentInfo();
	}
}

package ch06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee =new Student();
		Student studentKim =new Student(12345,"kim",4);
		System.out.println(studentLee.showStudentInfo());
		System.out.println(studentKim.showStudentInfo());
	}
}

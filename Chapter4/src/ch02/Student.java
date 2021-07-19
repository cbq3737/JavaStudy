package ch02;

public class Student implements Cloneable{
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum,String studentName) {
		this.studentNum = studentNum;
		this.studentName =studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String toString() {
		return studentNum + "," + studentName;
	}
	//Student의 학번이 같으면 같은 학생이라고 표시해주기 위하여 equals와 hashcode를 재정의한다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { //Student형이면
			Student std= (Student)obj; //다운캐스팅
			if(this.studentNum == std.studentNum) {//학번이 같은지 판단
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
	
		return studentNum;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

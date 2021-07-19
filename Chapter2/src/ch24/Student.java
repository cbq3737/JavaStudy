package ch24;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private int total = 0;
	ArrayList<Subject> arrsub; 

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		arrsub = new ArrayList<>();
	}

	public void addSubject(String subject, int score) {
		arrsub.add(new Subject(subject, score));
	}

	public void showStudentInfo() {
		for (int i = 0; i < arrsub.size(); i++) {
			System.out.println("학생" + this.studentName + "의 " + arrsub.get(i).getSubject() + "과목의 성적은"
					+ arrsub.get(i).getScore() + "입니다.");
			total += arrsub.get(i).getScore();
		}
		System.out.println("학생" + this.studentName + "의 총점은" + total + "입니다.");
	}
}

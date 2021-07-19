package ch09;

public class Subject {
	private String subjectName;
	private int score;
	private int subjectId;
	
	public void setSubject(String subjectName,int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public int getSubjectScore() {
		return score;
	}
}

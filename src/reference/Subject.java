package reference;

public class Subject {
	
	String subjectName;
	int score;
	
	// ������ �����
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

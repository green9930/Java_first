package reference;

public class Student {
	int id;
	String studentName;
	Subject korean;
	Subject math;
	
	// ������ 
	public Student() {}

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
		
		korean = new Subject("����");
		math = new Subject("����");
	} 
	
	public void setKorean(int score) {
		korean.setScore(score);
	}	
	
	public void setMath(int score) {
		math.setScore(score);
	}

	public void showStudentInfo() {
		int total = korean.getScore() + math.getScore();
		System.out.println(studentName + ": " + total);
	}
}


package array;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	// Subject 자료형을 가져와 배열로 관리
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	// 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentID + " 학생 이름 : " + studentName + ", " + subject.getName() + " " + subject.getScore());
		}
		
		System.out.println("Total Score : " + total);

	}
	
}

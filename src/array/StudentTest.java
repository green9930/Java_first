package array;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(01, "Lee");
		Student Kim = new Student(02, "Kim");
		
		Lee.addSubject("korean", 100);
		Lee.addSubject("math", 80);
		Lee.showStudentInfo();
		
		Kim.addSubject("korean", 90);
		Kim.addSubject("math", 95);
		Kim.showStudentInfo();
	}

}

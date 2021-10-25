package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(01, "Lee");
		Lee.setKorean(100);
		Lee.setMath(90);
		
		Student Kim = new Student(02, "Kim");
		Kim.setKorean(80);
		Kim.setMath(90);
		
		Lee.showStudentInfo(); // Lee: 190
		Kim.showStudentInfo(); // Kim: 170
	}

}

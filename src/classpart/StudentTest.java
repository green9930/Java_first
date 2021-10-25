package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(10, "John");
//		studentLee.studentName = "John";
//		studentLee.address = "Seoul";
		
//		Student studentKim = new Student();
//		studentKim.studentName = "Kim";
//		studentKim.studentID = 101;
//		studentKim.address = "New York";
		
//		System.out.println(studentKim); // classpart.Student@b4c966a (클래스의 풀네임).(클래스이름)@(16진수 - 32비트의 메모리 주소 (참조값)) 
		System.out.println(studentLee); // classpart.Student@2f4d3709
		
//		studentLee.setStudentName("Lee");
		studentLee.showStudentInfo(); 
		System.out.println(studentLee.getStudentName()); // John
	}

}

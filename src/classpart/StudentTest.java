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
		
//		System.out.println(studentKim); // classpart.Student@b4c966a (Ŭ������ Ǯ����).(Ŭ�����̸�)@(16���� - 32��Ʈ�� �޸� �ּ� (������)) 
		System.out.println(studentLee); // classpart.Student@2f4d3709
		
//		studentLee.setStudentName("Lee");
		studentLee.showStudentInfo(); 
		System.out.println(studentLee.getStudentName()); // John
	}

}

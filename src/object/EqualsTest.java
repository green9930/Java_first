package object;

class Student {
	
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// studentID�� ���ؼ� ��ġ�ϸ� true�� ��ȯ�ϵ���
	// �Ű����� obj�� Object Ÿ��
	@Override
	public boolean equals(Object obj) {
		// �ٿ�ĳ����
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (studentID == std.studentID) return true;
			else return false;
		}
		return false;
	}

	// equals()�� �����ǵǾ��� ������ hashCode()�� ������
	@Override
	public int hashCode() {
		return studentID;
	}
	
	

}

public class EqualsTest {
	public static void main(String[] args) {
		String str1 = new String("test");
		String str2 = new String("test");

		Student lee = new Student(101, "Lee");
		Student kim = new Student(101, "Lee");
		
		System.out.println(str1 == str2); // false : ��¡�� �޸� �ּҴ� �ٸ��� ����
		System.out.println(str1.equals(str2)); // true : �������� ����
		
		System.out.println(lee == kim); // false
		// equals ������ ��
//		System.out.println(lee.equals(kim)); // false
		// equals ������ ��
		// �ּ� ���� �ٸ����� �������� ����
		System.out.println(lee.equals(kim)); // true

		// hashcode �޼��尡 �����ǵǾ��� ������ ������ hashcode ���� ���´�.
		System.out.println(str1.hashCode()); // 3556498
		System.out.println(str2.hashCode()); // 3556498
		
		System.out.println(System.identityHashCode(str1)); // 495053715
		System.out.println(System.identityHashCode(str2)); // 1922154895

		// hashCode() ������ ��
//		System.out.println(lee.hashCode()); // 793589513
//		System.out.println(kim.hashCode()); // 1313922862
		
		// hashCode() ������ ��
		System.out.println(lee.hashCode()); // 101
		System.out.println(kim.hashCode()); // 101
		
	}
}

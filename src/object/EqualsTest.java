package object;

class Student {
	
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// studentID를 비교해서 일치하면 true를 반환하도록
	// 매개변수 obj는 Object 타입
	@Override
	public boolean equals(Object obj) {
		// 다운캐스팅
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (studentID == std.studentID) return true;
			else return false;
		}
		return false;
	}

	// equals()가 재정의되었기 때문에 hashCode()도 재정의
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
		
		System.out.println(str1 == str2); // false : 저징된 메모리 주소는 다르기 때문
		System.out.println(str1.equals(str2)); // true : 논리적으로 동일
		
		System.out.println(lee == kim); // false
		// equals 재정의 전
//		System.out.println(lee.equals(kim)); // false
		// equals 재정의 후
		// 주소 값은 다르지만 논리적으로 동일
		System.out.println(lee.equals(kim)); // true

		// hashcode 메서드가 재정의되었기 때문에 동일한 hashcode 값이 나온다.
		System.out.println(str1.hashCode()); // 3556498
		System.out.println(str2.hashCode()); // 3556498
		
		System.out.println(System.identityHashCode(str1)); // 495053715
		System.out.println(System.identityHashCode(str2)); // 1922154895

		// hashCode() 재정의 전
//		System.out.println(lee.hashCode()); // 793589513
//		System.out.println(kim.hashCode()); // 1313922862
		
		// hashCode() 재정의 후
		System.out.println(lee.hashCode()); // 101
		System.out.println(kim.hashCode()); // 101
		
	}
}

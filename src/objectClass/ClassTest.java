package objectClass;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// class를 가져오는 방법
		// 1. 인스턴스가 생성되어 있으면 getClass() (Object의 메서드) 메서드 사용 가능
		Person person = new Person();
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName()); // objectClass.Person

		// 2. 직접 클래스 파일 할당하기
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName()); // objectClass.Person

		// 3. Class.forName("클래스 이름") 메서드 사용
		Class pClass3 = Class.forName("java.lang.String");
		System.out.println(pClass3.getName());
		
		// (정적 로딩) 1, 2 방식은 이미 Person 클래스가 컴파일되어 존재해야 사용할 수 있음
		// (동적 로딩) 3 방식은 미리 존재하지 않아도 forName()내부와 일치하는 이름의 클래스가 있으면 메모리에 로딩을 시킨다.
		// 코드를 실행하는 순간 java.lang.String 이름을 가진 클래스가 있으면 가져온다.
		
		Person p = new Person();
		
		Class pClass = Class.forName("objectClass.Person");
		
		// newInstance의 리턴은 Object
		Person p2 = (Person)pClass.newInstance();
		
		System.out.println(p); // objectClass.Person@2f4d3709
		System.out.println(p2); // objectClass.Person@4e50df2e

	}

}

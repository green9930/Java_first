package classpart;

public class Person {

	String name;
	String address;
	
	// 생성자를 직접 구현하여 자바가 디폴트 생성자를 제공하지 않기 때문에 디폴트 생성자를 직접 만들어야 한다.
//	public Person() {}
	
	// 생성자 : 클래스 이름과 동일하게
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void printName() {
		System.out.println(name);
	}
	public void printAddress() {
		System.out.println(address);
	}
}

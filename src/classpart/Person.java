package classpart;

public class Person {

	String name;
	String address;
	
	// �����ڸ� ���� �����Ͽ� �ڹٰ� ����Ʈ �����ڸ� �������� �ʱ� ������ ����Ʈ �����ڸ� ���� ������ �Ѵ�.
//	public Person() {}
	
	// ������ : Ŭ���� �̸��� �����ϰ�
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

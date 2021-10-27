package objectClass;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// class�� �������� ���
		// 1. �ν��Ͻ��� �����Ǿ� ������ getClass() (Object�� �޼���) �޼��� ��� ����
		Person person = new Person();
		Class pClass1 = person.getClass();
		
		System.out.println(pClass1.getName()); // objectClass.Person

		// 2. ���� Ŭ���� ���� �Ҵ��ϱ�
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName()); // objectClass.Person

		// 3. Class.forName("Ŭ���� �̸�") �޼��� ���
		Class pClass3 = Class.forName("java.lang.String");
		System.out.println(pClass3.getName());
		
		// (���� �ε�) 1, 2 ����� �̹� Person Ŭ������ �����ϵǾ� �����ؾ� ����� �� ����
		// (���� �ε�) 3 ����� �̸� �������� �ʾƵ� forName()���ο� ��ġ�ϴ� �̸��� Ŭ������ ������ �޸𸮿� �ε��� ��Ų��.
		// �ڵ带 �����ϴ� ���� java.lang.String �̸��� ���� Ŭ������ ������ �����´�.
		
		Person p = new Person();
		
		Class pClass = Class.forName("objectClass.Person");
		
		// newInstance�� ������ Object
		Person p2 = (Person)pClass.newInstance();
		
		System.out.println(p); // objectClass.Person@2f4d3709
		System.out.println(p2); // objectClass.Person@4e50df2e

	}

}

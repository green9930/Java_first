package first;

public class OperationEx {

	public static void main(String[] args) {
		int num1 = 10;
		int i  = 2;
		
		var value1 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value1); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2 : �� �׿��� false�� ���� �� ��° ���� ������ �ʾ����Ƿ� �״�� 2 ���
		
		var value2 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value2); // true
		System.out.println(num1); // 30
		System.out.println(i); // 2 : �� �׿��� true�� ���� �� ��° ���� ����� �ʿ䰡 �������Ƿ� �״�� 2 ���
		
		// ��������
		int myAge = 23;
		int teacherAge = 38;
		
		System.out.println(myAge <= 25); // true
		System.out.println(myAge == teacherAge); // false

		
	}

}

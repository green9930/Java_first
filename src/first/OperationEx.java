package first;

public class OperationEx {

	public static void main(String[] args) {
		int num1 = 10;
		int i  = 2;
		
		var value1 = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value1); // false
		System.out.println(num1); // 20
		System.out.println(i); // 2 : 앞 항에서 false가 나와 두 번째 항은 계산되지 않았으므로 그대로 2 출력
		
		var value2 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value2); // true
		System.out.println(num1); // 30
		System.out.println(i); // 2 : 앞 항에서 true가 나와 두 번째 항은 계산할 필요가 없었으므로 그대로 2 출력
		
		// 연습문제
		int myAge = 23;
		int teacherAge = 38;
		
		System.out.println(myAge <= 25); // true
		System.out.println(myAge == teacherAge); // false

		
	}

}

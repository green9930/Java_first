package interfaceEx;

public class CalculatorTest {
	public static void main(String[] args) {
		// CompleteCalc Ŭ������ Calc�� ������ �����ϰ� �־�� �Ѵ�. (Ÿ�Ի��)
		Calc calc1 = new CompleteCalc(); 
//		Calc calc2 = new Calc(); // Error : �߻� Ŭ����
//		Calc calc3 = new Calculator(); // Error : �߻� Ŭ����
		System.out.println(calc1.add(10, 12)); // 22
		
//		calc1.showInfo(); �� �� �� ���� : CompleteCalc�� ����� �޼����̱� ������
		
		Calc calc4 = new CompleteCalc();
		System.out.println(calc4.square(3)); // 9 
		
		calc1.description(); // �Ϻ��� �����Դϴ�. : �޼��� �������̵��� ���� �ν��Ͻ� �޼��� ���
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum); // 15
	}
	
}

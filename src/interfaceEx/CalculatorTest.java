package interfaceEx;

public class CalculatorTest {
	public static void main(String[] args) {
		// CompleteCalc 클래스가 Calc의 정보를 내포하고 있어야 한다. (타입상속)
		Calc calc1 = new CompleteCalc(); 
//		Calc calc2 = new Calc(); // Error : 추상 클래스
//		Calc calc3 = new Calculator(); // Error : 추상 클래스
		System.out.println(calc1.add(10, 12)); // 22
		
//		calc1.showInfo(); 는 볼 수 없음 : CompleteCalc에 선언된 메서드이기 때문에
		
		Calc calc4 = new CompleteCalc();
		System.out.println(calc4.square(3)); // 9 
		
		calc1.description(); // 완벽한 계산기입니다. : 메서드 오버라이딩에 의해 인스턴스 메서드 출력
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum); // 15
	}
	
}

package first;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		// for문과 while문으로 구구단 만들기
		int dan;
		int times;
		
		for (dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println(); // 개행 용도
		}
		
		dan = 2;
//		times = 1;
		
		while(dan <= 9) {
			times = 1; // 내부 반복문을 실행하기 전에 내부에서 초기화를 해야 한다.
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();

			
		}
	}

}

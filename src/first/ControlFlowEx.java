package first;

public class ControlFlowEx {

	public static void main(String[] args) {		
		// 구구단에서 짝수 단만 출력하기
		int times;
		
		for(int i = 1; i <= 9; i++) {
			if(i % 2 != 0) continue;
			for (times = 1; times <= 9; times++) {
				System.out.println(i + "X" + times + "=" + i * times);
			}
			System.out.println();
		}
		
		// 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 구구단 만들기
		for (int i = 1; i <= 9; i++) {
			for (times = 1; times <= i; times++) {
				System.out.println(i + "X" + times + "=" + i * times);
			}
			System.out.println();
		}
		
		// for문으로 크리스마스 트리 만들기 (4층)
		
		int line1 = 4;
		
		for(int i = 1; i <= line1; i++) {
			for(int j = 1; j <= line1 - i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= i*2 - 1; j++) {
				System.out.print('*');
			}
			for(int j = 1; j <= line1; j++) {
				System.out.print(' ');
			}
			System.out.println();
		}
		
	}

}

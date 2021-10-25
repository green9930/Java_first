package first;

public class BreakEx {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		
		while (true) {
			sum += num;
			if(sum > 100) break; // sum이 100을 넘는 순간 while문 실행 종료
			num ++;
		}
		
		System.out.println(sum); // 105	
		System.out.println(num); // 14
	}

}

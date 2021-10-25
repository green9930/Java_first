package first;

public class ContinueEx {

	public static void main(String[] args) {
	 	int total = 0;
	 	int num;
	 	
	 	for(num = 1; num <= 100; num++) {
	 		if ((num % 2) == 1) {
	 			continue; // num값이 홀수인 경우 이후 수행을 생략하고 num++ 실행
	 		}
	 		total += num; // num값이 짝수인 경우 실행
	 	}
	 	System.out.println(total); // 2550
	}

}

package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열 초기화 
		// 요소를 넣으면 배열의 개수를 생략해야 한다.
		int[] numbers = new int[] {0, 1, 2};
		// 요소가 30개인 배열 생성
		int[] students = new int[30];
		
		// 에러 발생 : 배열 선언만 하고 new 연산자로 인스턴스를 생성하지 않음 
//		int[] sample;
//		
//		sample[0] = 1;
//		sample[1] = 2;
//		sample[2] = 3;
		int[] sample = {1, 2, 3};
		
		// 초기화 값 없이 배열 선언한 경우
		int[] nothing1 = new int[3];
		float[] nothing2 = new float[3];
		String[] nothing3 = new String[3];
		

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); // 0 1 2
		}
		
		System.out.println(numbers.length); // 3
		System.out.println(students.length); // 30
		System.out.println(sample.length); // 3
		
		System.out.println(nothing1[0]); // 0
		System.out.println(nothing2[1]); // 0.0
		System.out.println(nothing3[2]); // null
	}

}

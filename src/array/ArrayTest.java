package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ 
		// ��Ҹ� ������ �迭�� ������ �����ؾ� �Ѵ�.
		int[] numbers = new int[] {0, 1, 2};
		// ��Ұ� 30���� �迭 ����
		int[] students = new int[30];
		
		// ���� �߻� : �迭 ���� �ϰ� new �����ڷ� �ν��Ͻ��� �������� ���� 
//		int[] sample;
//		
//		sample[0] = 1;
//		sample[1] = 2;
//		sample[2] = 3;
		int[] sample = {1, 2, 3};
		
		// �ʱ�ȭ �� ���� �迭 ������ ���
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

package objectString;

public class StringBuilderTest {
	public static void main(String[] args) {
		String str1 = new String("java");
		
		System.out.println(System.identityHashCode(str1)); // 189568618
		
		StringBuilder str2 = new StringBuilder(str1);
		
		System.out.println(System.identityHashCode(str2)); // 793589513
		
		str2.append(" and");
		str2.append(" android");
		
		// 값이 변해도 str2 메모리 주소 유지
		System.out.println(System.identityHashCode(str2)); // 793589513
		
		System.out.println(str2.toString()); // java and android

	}
}

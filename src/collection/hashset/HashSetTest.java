package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);

		// 중복을 허용하지 않기 때문에 같은 element는 추가되지 않음
		set.add("aaa");

		System.out.println(set);

	}
}

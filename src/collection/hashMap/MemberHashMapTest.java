package collection.hashMap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member lee = new Member(102, "Lee");
		Member kim = new Member(101, "Kim");
		Member bae = new Member(103, "Bae");
		
		memberHashMap.addMember(lee);
		memberHashMap.addMember(kim);
		memberHashMap.addMember(bae);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(102);
		
		memberHashMap.showAllMember();
		
	}

}

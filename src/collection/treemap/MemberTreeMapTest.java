package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member lee = new Member(102, "Lee");
		Member kim = new Member(101, "Kim");
		Member bae = new Member(103, "Bae");
		
		memberTreeMap.addMember(lee);
		memberTreeMap.addMember(kim);
		memberTreeMap.addMember(bae);
		
		memberTreeMap.showAllMember();
		
//		memberTreeMap.removeMember(102);
		
//		memberTreeMap.showAllMember();
		
	}

}

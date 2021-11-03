package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member lee = new Member(102, "Lee");
		Member kim = new Member(101, "Kim");
		 Member bae = new Member(103, "Bae");
		
		memberTreeSet.addMember(lee);
		memberTreeSet.addMember(kim);
		memberTreeSet.addMember(bae);
		
		memberTreeSet.showAll();
		
	}
}

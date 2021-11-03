package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {
	
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
	
		Member Lee = new Member(101, "Lee");
		Member Kim = new Member(102, "Kim");
		Member Park = new Member(103, "Park");
		
		memberArrayList.addMember(Lee);
		memberArrayList.addMember(Kim);
		memberArrayList.addMember(Park);
		
		memberArrayList.showAll();

		memberArrayList.removeMember(Kim.getMemberID());
		
		memberArrayList.showAll();
	}

}

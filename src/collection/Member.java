package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member>{

	private int memberID;
	private String memberName;
	
	public Member() {};
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public int compareTo(Member member) {

		// 추가된 멤버 아이디와 기존 트리륵 구성하고 있던 멤버 아이디를 비교
		// Id순으로 오름차순 정렬
//		return (this.memberID - member.memberID);
		// 이름 순으로 정렬
		return (this.memberName.compareTo(member.memberName));
	}

	@Override
	// 전달받은 두 매개변수 비교
	public int compare(Member member1, Member member2) {
		return (member1.memberID - member2.memberID);
	}
	
	
}

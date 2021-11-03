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
		return memberName + "���� ���̵�� " + memberID + "�Դϴ�.";
	}

	@Override
	public int compareTo(Member member) {

		// �߰��� ��� ���̵�� ���� Ʈ���� �����ϰ� �ִ� ��� ���̵� ��
		// Id������ �������� ����
//		return (this.memberID - member.memberID);
		// �̸� ������ ����
		return (this.memberName.compareTo(member.memberName));
	}

	@Override
	// ���޹��� �� �Ű����� ��
	public int compare(Member member1, Member member2) {
		return (member1.memberID - member2.memberID);
	}
	
	
}

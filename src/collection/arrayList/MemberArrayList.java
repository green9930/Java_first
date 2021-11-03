package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arraylist;

	public MemberArrayList() {
		arraylist = new ArrayList<Member>();
		
	}
	
	public void addMember(Member member) {
		arraylist.add(member);
	}
	
	public boolean removeMember(int memberID) {
//		for(int i = 0; i < arraylist.size(); i++) {
//			
//			Member member = arraylist.get(i);
//			int tempID = member.getMemberID();
//			
//			if (memberID == tempID) {
//				arraylist.remove(i);
//				return true;
//			}
//		}
		
		// ���ͷ����͵� ���׸� Ÿ������ ��� ����
		// ��ȯ�Ǵ� ��ü ���� ���� : ���� ���� �ҷ��� �� Ÿ��ĳ���� �� �ʿ� ������
		Iterator<Member> iterator = arraylist.iterator();
		
		// .hasNext() : ���Ŀ� ��Ұ� �� �ִ��� Ȯ���ϴ� �޼���
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempID = member.getMemberID();
			
			if (memberID == tempID) {
				arraylist.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID +  "�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	
	public void showAll() {
		for (Member member : arraylist) {
			System.out.println(member);
		}
		
		System.out.println(arraylist);
	}
	
}

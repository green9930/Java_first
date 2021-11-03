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
		
		// 이터레이터도 제네릭 타입으로 사용 가능
		// 순환되는 객체 지정 가능 : 이후 값을 불러올 때 타입캐스팅 할 필요 없어짐
		Iterator<Member> iterator = arraylist.iterator();
		
		// .hasNext() : 이후에 요소가 더 있는지 확인하는 메서드
		while(iterator.hasNext()) {
			Member member = iterator.next();
			
			int tempID = member.getMemberID();
			
			if (memberID == tempID) {
				arraylist.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID +  "가 존재하지 않습니다.");
		return false;
		
	}
	
	public void showAll() {
		for (Member member : arraylist) {
			System.out.println(member);
		}
		
		System.out.println(arraylist);
	}
	
}

package collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
		
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if (hashMap.containsKey(memberID)) {
			
			hashMap.remove(memberID);
			return true;
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		// keySet() : 모든 key값을 set 객체로 반환 
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}

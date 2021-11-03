package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
		
		private HashSet<Member> treeSet;
		
		public MemberHashSet() {
			treeSet = new HashSet<Member>(); 
		}
		
		public void addMember(Member member) {
			treeSet.add(member);
		}
		
		public boolean removeMember(int memberId) {
			Iterator<Member> iterator = treeSet.iterator();
			
			while(iterator.hasNext()) {
				Member member = iterator.next();
				
				int tempId = member.getMemberID();
				if(memberId == tempId) {
					treeSet.remove(member);
					return true;
				}
			}
			
			System.out.println(memberId + "가 존재하지 않습니다.");
			return false;
		}

		public void showAll() {
			for(Member member : treeSet) {
				System.out.println(member);
			}
			
			System.out.println();
		}

}
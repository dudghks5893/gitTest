package chapter12.collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import chapter12.collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	//맵에 입력되어있는 멤버 객체의 id값으로 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	//전체 멤버 정보를 출력
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next()	;
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}

package chapter12.collection.hashmap;

import chapter12.collection.Member;

public class MapTest {

	public static void main(String[] args) {
		MemberHashMap map = new MemberHashMap();
		
		//멤버클래스의 객체 m1 ~ m4
		Member m1 = new Member(1001, "이지원");
		Member m2 = new Member(1002, "이지원");
		Member m3 = new Member(1003, "이지원");
		Member m4 = new Member(1004, "이지원");
		
		map.addMember(m1);
		map.addMember(m2);
		map.addMember(m3);
		map.addMember(m4);

		map.removeMember(1002); //손민국 삭제
		map.showAllMember();
	}

}

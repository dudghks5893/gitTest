package chapter12.collection.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member; //멤버에 마우스 올리고 챕터 12에서 가져옴

public class MemberArrayList {
	//필드변수 선언
	private ArrayList<Member> arrayList; //어레이리스트 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member형으로 선언한 어레이리스트 생성
	}
	
	public void addMember(Member member) { //어레이리스트에 회원을 추가하는 메서드
		arrayList.add(member); 
		
	}
	
	
	
	public boolean removeMamber(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);	//get() 메서드로 회원을 순차적으로 가져옴
			int tempId = member.getMemberId();	//아이디만 따로 저장
			if(tempId == memberId) {	//회원 아이디가 매개변수와 일치하면
				arrayList.remove(i);	//해당 회원을 삭제
				return false;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");	//반복문이 끝날때까지 해당 아이디를 찾지 못한 경우
		return false;										//해당 아이디를 가진 회원을 어레이리스트에서 찾아 제거함
	}
	
	public void showAllMember() {		//전체 회원을 출력하는 메소드
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

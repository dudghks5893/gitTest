package chapter12.collection.arraylist;

import java.util.ArrayList;

import chapter12.collection.Member; //����� ���콺 �ø��� é�� 12���� ������

public class MemberArrayList {
	//�ʵ庯�� ����
	private ArrayList<Member> arrayList; //��̸���Ʈ ����
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //Member������ ������ ��̸���Ʈ ����
	}
	
	public void addMember(Member member) { //��̸���Ʈ�� ȸ���� �߰��ϴ� �޼���
		arrayList.add(member); 
		
	}
	
	
	
	public boolean removeMamber(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);	//get() �޼���� ȸ���� ���������� ������
			int tempId = member.getMemberId();	//���̵� ���� ����
			if(tempId == memberId) {	//ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);	//�ش� ȸ���� ����
				return false;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");	//�ݺ����� ���������� �ش� ���̵� ã�� ���� ���
		return false;										//�ش� ���̵� ���� ȸ���� ��̸���Ʈ���� ã�� ������
	}
	
	public void showAllMember() {		//��ü ȸ���� ����ϴ� �޼ҵ�
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}

package chapter12;

import java.util.ArrayList;

public class genericEx {
	public static void main(String[] args) {
		ArrayList<String> slist = new ArrayList<String>();
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		
		//���ڿ� ����Ʈ
		slist.add("���ڿ�1");
		slist.add("���ڿ�2");
		slist.add("���ڿ�3");
		slist.add("���ڿ�4");
		
		//���� ����Ʈ
		ilist.add(1);
		ilist.add(2);
		ilist.add(3);
		ilist.add(4);
		
		for(String s : slist) {
			System.out.println(s);
		}
		for(Integer i : ilist) {
			System.out.println(i);
		}
		
	}
}

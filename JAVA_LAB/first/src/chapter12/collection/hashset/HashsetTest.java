package chapter12.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetTest {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("���ؽ�"));
		
		
		
		System.out.println(hashSet); 	//�ؽü��� �ߺ��� ������� �ʴ´�
										//�������� ��µǳ�
	}

}

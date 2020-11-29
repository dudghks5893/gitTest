package chapter12.collection.hashmap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		//�����̶�� ���� key�� ���ڿ�, value�� ���ڿ�
		HashMap<String, String> map = new HashMap<>();
		
		map.put("�л�", "�����ϴ� ����̴�.");
		map.put("���찳", "������ ����ϴ�.");
		map.put("������", "�µ��� ����ϴ�.");
		map.put("�ռҵ���", "�ڷγ��� �����մϴ�.");
		
//		System.out.println(map);
//		System.out.println(map.get("���찳"));
		
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println(map.get(key));
			System.out.println();
		}
	}

}

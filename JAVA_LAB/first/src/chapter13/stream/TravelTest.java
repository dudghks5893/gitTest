package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer lee = new TravelCustomer("�̼���",40,100);
		TravelCustomer kim = new TravelCustomer("������",20,100);
		TravelCustomer hong = new TravelCustomer("ȫ�浿",13,50);
		
		List<TravelCustomer> cList = new ArrayList<TravelCustomer>();
		
		cList.add(lee);
		cList.add(kim);
		cList.add(hong);
		
		System.out.println("=== �� ��� �߰��� ������� ���===");
		cList.stream()	//����Ʈ�� ��Ʈ�� �����
				.map(c -> c.getName()) //�̸����� ����Ʈ
				.forEach(s -> System.out.println(s));
		
		int total = cList.stream()
							.mapToInt(c -> c.getPrice()) // �� Ÿ���� �� ��Ʈ�� ���������� ��ȯ
							.sum(); 	//���ϱ�
		System.out.println("�� ���� ����:"+total+"�Դϴ�.");
		
		System.out.println("== 20�� �̻� �� ��� �����Ͽ� ���==");
		cList.stream()
				.filter(c -> c.getAge() >= 20)
				.map(c -> c.getName())
				.sorted()
				.forEach(s -> System.out.println(s));
	}

}

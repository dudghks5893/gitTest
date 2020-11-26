package testEx.ex10jang;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B : Bu");
		System.out.println("H : He");
		System.out.println("Q : Qu");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch =='B' || ch =='b') {
			sort = new BubbleSort();
		}
		else if(ch =='H' || ch =='h') {
			sort = new HeapSort();
		}
		else if(ch =='Q' || ch =='q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("���� ����");
			return;
		}
		
		//���� ��İ� ������� Sort�� ����� �޼��� ȣ��
		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
	}

}
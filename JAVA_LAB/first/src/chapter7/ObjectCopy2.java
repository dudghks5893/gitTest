package chapter7;

public class ObjectCopy2 {

	public static void main(String[] args) {
		// ��ü �迭 �����ϱ�
		Book[] b1 = new Book[3];
		Book[] b2 = new Book[3];
		
		b1[0] = new Book("�¹���","������");
		b1[1] = new Book("���̾�","�츣�� �켼");
		b1[2] = new Book("��� �� ���ΰ�","���ù�");
		
		System.arraycopy(b1, 0, b2, 0, 3);
		
		for(int i=0; i<b2.length; i++) {
			b2[i].showBookInfo();
		}
		b1[0].setBookName("����");
		b1[0].setAuthor("�ڿϼ�");
		
		System.out.println("===== bookArray1 =====");
		
		for(int i=0; i<b1.length; i++) {
			b1[i].showBookInfo();
	}
		System.out.println("===== bookArray2 =====");
		
		for(int i=0; i<b2.length; i++) {
			b2[i].showBookInfo();
	}
}
}
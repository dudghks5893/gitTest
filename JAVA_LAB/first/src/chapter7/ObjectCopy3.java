package chapter7;

public class ObjectCopy3 {

	public static void main(String[] args) {
		// ��ü �迭 �����ϱ�
		Book[] b1 = new Book[3];
		Book[] b2 = new Book[3];
		
		b1[0] = new Book("�¹���","������");
		b1[1] = new Book("���̾�","�츣�� �켼");
		b1[2] = new Book("��� �� ���ΰ�","���ù�");
		
		b2[0] = new Book(); // ����Ʈ ������
		b2[1] = new Book();
		b2[2] = new Book();
		
	// å�� �̸��� ������ ���� b1 ��ü���� b2��ü�� ����
		for(int i=0; i < b1.length; i++) {
			b2[i].setBookName(b1[i].getBookName());
			b2[i].setAuthor(b1[i].getAuthor());
			

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

package chapter10.Bookshelf;

//�������̽� ť
public interface Queue {
	//�ֻ� �޼ҵ� 3��
	void enQueue(String title);	//�迭�� �� �������� �߰�
	String deQueue();	//�迭�� �� ó�� �׸� �߰�
	int getSize();		//���� Queue�� �ִ� ���� ��ȯ
}


class BookShelf extends Shelf implements Queue {

	@Override // ����Ʈ shelf�� Ÿ��Ʋ�� �Է� => ������ �Է�
	public void enQueue(String title) {
		shelf.add(title); //��� ���� Shelf Ŭ������ shelf ��̸���Ʈ
	}
	@Override // ����Ʈ shelf�� ù��° �ε�����Ҹ� ���� => ������ ����
	public String deQueue() {
		return shelf.remove(0); 
	}
	@Override //����Ʈ shelf�� ���� ����� ���� => ���� ���� ����
	public int getSize() {
		return getCount();
	}
//	 shelf ����Ʈ�� ��� ��Ҹ� �ε��� ��ȣ�� ���� ���
	public void showQueue() {
		for (int i = 0; i<shelf.size();i++) {
			System.out.printf("�ε��� %d�� %s \n", i, shelf.get(i));
		}
		
	}
	
}
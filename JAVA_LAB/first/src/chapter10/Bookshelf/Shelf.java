package chapter10.Bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf; //����Ʈ ���� (��ü����)
	
	public Shelf() { //������
		shelf = new ArrayList<String>(); //����Ʈ ����
	}
	public ArrayList<String> getShelf(){
		return shelf; //shelf ��̸���Ʈ�� �����Ѵ�.
	}
	public int getCount() { //����Ʈ ������
		return shelf.size();
	}
}

package chapter9;

//�߻� Ŭ������ ��ӹ��� �߻�Ŭ����
public abstract class NoteBook extends Computer {
	
	public void display() {
		System.out.println("��Ʈ�� ���÷���");
	}
}

//NoteBook �߻�Ŭ������ ��ӹ޾� ������ �������� ���� �޼ҵ尡 ������ ����
class MyNoteBook extends NoteBook{

	@Override
	public void typing() {
		System.out.println("��Ʈ�� Ÿ����!");
	}
	
}
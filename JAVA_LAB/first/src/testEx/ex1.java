package testEx;

public class ex1 {
	public static void main(String[] args) {
		
		take kim = new take("�达",30000);
		take E = new take("�̾�",20000);
		
		//�达 ���̽��Ƹ޸�ī�� �ֹ�
		star AA = new star("���̽��Ƹ޸�ī��");
		kim.AA(AA);
		kim.show();
		AA.show();
		//�达 ī��Ḷ���ƶ� �ֹ�
		star ka = new star("ī��Ḷ���ƶ�");
		kim.karamall(ka);
		kim.show();
		ka.show();
				
		//�̾� �� �ֹ�
		kong rata = new kong("��ũ��");
		E.rata(rata);
		E.show();
		rata.show();
	}
}

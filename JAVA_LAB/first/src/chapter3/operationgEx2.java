package chapter3;

public class operationgEx2 {
	public static void main(String[] args) {
		//���� ������
		int gameScore=150;
		
		int lastScore1=gameScore++;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int num=1;
		
		int num2=num++;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num2);
		
		//���迬����
		System.out.println(2>1);
		System.out.println(2<1);
		
		int a=10;
		int b=20;
		
		System.out.println(a>b);
		System.out.println(b>a);
		System.out.println(a==b);		
		System.out.println(a!=b);		//�� �� ���� �ٸ��� ��, �ƴϸ� ����

		System.out.println(num2);//�׳��Ѱ�
		//�� ������
		System.out.println((true)&&(true));
		System.out.println((true)&&(false));
		System.out.println((false)&&(true));
		System.out.println((false)&&(false));
		
		System.out.println(num2);//�׳��Ѱ�
		//�� ������ || or
		System.out.println((true)||(true));
		System.out.println((true)||(false));
		System.out.println((false)||(true));
		System.out.println((false)||(false));
		
		//������� ���
		System.out.println((false)&&(a!=b));
		System.out.println((true)||(a>b));
		
		//���� ���� ������
		
		int n1 =2;
		n1 =+2;
		System.out.println(n1);
		n1 *=2;
		System.out.println(n1);
		n1 /= 2;
		System.out.println(n1);
	}

}

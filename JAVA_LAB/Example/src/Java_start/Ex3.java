package Java_start;

public class Ex3 {

	public static void main(String[] args) {
	/* ��Ƽ�ּ� : CTRL+SHIFT+/
	 * �Է� ���ڿ��� �Ǽ��� ����ȯ 
	 **/
	double f = Double.parseDouble(args[0]);	
	
	System.out.println(f);
//	ȭ�� �µ��� ������ ���
	double c = (f-32.0)/1.8;
	
	System.out.println("���ٶٿ�");
	System.out.println("���ٶٿ�");
	System.out.printf("%.1f��=> %.1f�� �Դϴ�!\n",f, c);
	
	System.out.println(6*(5-3)+"7");
	
	}

}

package method;

public class ex4 {

	public static void main(String[] args) {
		
		double dollar = dice() + dice() + dice ();
		double won = exchange (dollar);
		
		System.out.printf("ȹ�� �ݾ�:$%.2f(%.0f��)",dollar, won);
// �ٸ� Ŭ�������� �޼ҵ� �ҷ�����  ex3.CE(G, D)
	}	
public static double exchange (double dollar) {
	//�Է¹��� �޷��� ȯ���Ͽ� ��ȯ�Ͻÿ�.
	return dollar*1082.25108;
}

private static int dice() {
	//math.random �޼ҵ带 Ȱ���ؼ� 1-6���� �������� ��ȯ
	return (int) (Math.random()*6)+1;
}

}

package method;

public class ex4 {

	public static void main(String[] args) {
		
		double dollar = dice() + dice() + dice ();
		double won = exchange (dollar);
		
		System.out.printf("획득 금액:$%.2f(%.0f원)",dollar, won);
// 다른 클레스에서 메소드 불러오기  ex3.CE(G, D)
	}	
public static double exchange (double dollar) {
	//입력받은 달러를 환전하여 반환하시오.
	return dollar*1082.25108;
}

private static int dice() {
	//math.random 메소드를 활용해서 1-6사이 정수값을 반환
	return (int) (Math.random()*6)+1;
}

}


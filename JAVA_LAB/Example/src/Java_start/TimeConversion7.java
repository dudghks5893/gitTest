package Java_start;

public class TimeConversion7 {

	public static void main(String[] args) {
		
		int totalSec=7582;
		int a=(totalSec/60)/60;
		int min=(totalSec/60)%60;
		int sec=totalSec%60;
		
		System.out.printf("%d�ð� %d�� %d��",a,min,sec);
		

	}

}

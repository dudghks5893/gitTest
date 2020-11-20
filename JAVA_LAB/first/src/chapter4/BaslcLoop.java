package chapter4;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class BaslcLoop {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		while(num<=50) {
			sum=sum+num;
			num=num+1;
		
		}
		
		System.out.println("1부터 50까지의 합은"+num+"입니다.");
	
		
		
	}

}

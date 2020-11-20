package chapter2;

public class Conversion1 {

		public static void main(String[] args) {
			// 자동 형변환 (작은수=>큰수,정수=>실수)
			byte bNum=10;
			int iNum=bNum;

			int iNum2=20;
			float fNum=iNum2;
			System.out.println(fNum);
			double dNum;
			dNum=fNum;
			System.out.println(iNum);
		}
}

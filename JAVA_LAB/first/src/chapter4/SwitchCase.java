package chapter4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		//����� �Է��� �޴� ��ĳ�� Ŭ����

 
		//���� Ŭ�� �� �ڹ� ��ƿ ����Ŭ������, �ڵ�� �ڵ��߰� (��Ʈ�� �����̽�)

		Scanner scanner = new Scanner(System.in);

		System.out.println("���� �Է��� �ּ��� : ");		



		String floor;

 

		floor = scanner.next(); //����ڰ� �Է��� ���� �����Ѵ�.

 

		switch(floor) {


		case "5��" : 


			System.out.println("�ｺŬ�� �Դϴ�."); 


			break; //����ġ���� ����������

		case "4��" : 

			System.out.println("ġ���Դϴ�."); 

			break; //����ġ���� ����������

		case "3��" : 

		System.out.println("�Ǻΰ��Դϴ�."); 

			break; //����ġ���� ����������
		
 		case "2��" : 

			System.out.println("�����ܰ� �Դϴ�."); 

			break; //����ġ���� ����������

		case "1��" : 

			System.out.println("�౹�Դϴ�."); 

			break; //����ġ���� ����������

		default : 
		System.out.println("");

		}

	}

}
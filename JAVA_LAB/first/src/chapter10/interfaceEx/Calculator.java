package chapter10.interfaceEx;

//�������̽��� implements�� ����Ѵ�.
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}

// Ŭ������ ��� �߻� �޼ҵ带 �����ؾ� �Ѵ�.
class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 !=0) {
			
			return num1/num2;
		}
		else {
			return Calc.ERROR;
		}
	}
public void showinfo() {
	System.out.println("Calc �������̽��� �����߽��ϴ�.");
}


	}
	

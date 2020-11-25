package chapter10.interfaceEx;

//인터페이스는 implements를 사용한다.
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

// 클래스는 모두 추상 메소드를 구현해야 한다.
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
	System.out.println("Calc 인터페이스를 구현했습니다.");
}


	}
	

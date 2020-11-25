package chapter10.interfaceEx;


//인터페이스 Calc
public interface Calc {
	//상수
	double PI = 3.14;
	int ERROR = -9999999;
	//메소드는 모두 추상메소드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}

package chapter10.interfaceEx;


//�������̽� Calc
public interface Calc {
	//���
	double PI = 3.14;
	int ERROR = -9999999;
	//�޼ҵ�� ��� �߻�޼ҵ�
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}

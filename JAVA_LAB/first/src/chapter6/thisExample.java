package chapter6;

//����
class Birthday{
	int day;
	int	month;
	int year;
	
//�޼ҵ�
	public void setYear(int year) {
		this.year = year;  //�⵵�� �Է�
	}
	public void printThis() {
		System.out.println(this); //this�� ���
	}
}

public class thisExample {

	public static void main(String[] args) {
		Birthday myDay = new Birthday(); //��ü ����
		myDay.setYear(2000); // �⵵ �Է� (this==myDay)
		System.out.println(myDay);
		myDay.printThis();

		
		Birthday yourDay = new Birthday(); //��ü ����
		myDay.setYear(2000); // �⵵ �Է� (this==yourDay)
		System.out.println(yourDay);
		myDay.printThis();

	}

}

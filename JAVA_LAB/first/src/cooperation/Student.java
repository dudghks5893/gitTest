package cooperation;

public class Student {
	//�ʵ�
	public String studentName;
	public int grade;
	public int money;
	public int fare;
	//������  �ڵ����� ����-Source->Generate Constructor using FIelds
	public Student(String studentName,int money) {
//		super();  ���ʿ� ���°Ŷ� ���� 
		this.studentName = studentName;
//		this.grade = grade; 
		this.money = money;
	}
	
	//�޼ҵ�: ������ Ÿ�� 1000���� �����Ѵ�.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	//�޼ҵ�: ����ö�� Ÿ�� 1500���� �����Ѵ�.
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	//�޼ҵ�: �ؽø� ź��. ���� fare
	public void takeTaxi(Taxi taxi, int fare) {
		taxi.take(fare);
		this.money -= fare;
	}
	public void showInfo() {
		System.out.println(studentName +"���� ���� ����"+ money +"�Դϴ�.");
	}
}
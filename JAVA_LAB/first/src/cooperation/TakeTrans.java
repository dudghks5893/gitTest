package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
	// �л��� ������ ����ö Ÿ��
		//�л� ���� (�̸�,money) �ʱ�ȭ
		Student s1 = new Student("���ӽ�", 5000);
		Student s2 = new Student("�丶��", 10000);
		Student s3 = new Student("��ȯ", 10000000);
		
		Bus bus100 = new Bus(100);  //100�� ���� ����
		s1.takeBus(bus100); //���ӽ��� 100������ ž��
		s1.showInfo();	//���ӽ� ����
		bus100.showInfo();	//100�� ���� ����
		
		Subway subwayGreen = new Subway("2ȣ��"); //2ȣ�� ����ö ����
		s2.takeSubway(subwayGreen);	//�丶���� 2ȣ�� ž��
		s2.showInfo();	//�丶�� ���� ���
		subwayGreen.showInfo(); //����ö ���� ���
		
		Taxi taxi= new Taxi(3000);
		s3.takeTaxi(taxi,5000); //��ȯ�� �ؽ� ž��
		s3.showInfo(); // ��ȯ ����
		taxi.showInfo(); // �ý� ����
	}

}
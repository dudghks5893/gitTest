package class_study;

class Cylinder{
	double radius; //������
	double height; //����
	
	double getVolume() {
		return (radius * radius * Math.PI)*height;
	}
	double getArea() {
		return 2*(radius * radius * Math.PI)+(2*(radius*Math.PI*height));
	}
}

public class ex1 {

	public static void main(String[] args) {
		//��ü ����
		Cylinder c = new Cylinder();
		
		//�Ӽ� �� �Է�
		c.radius = 4;
		c.height = 5;
		
		//���
		System.out.printf("������� ����: %.2f \n",c.getVolume());
		System.out.printf("������� �ѳ���: %.2f \n",c.getArea());
	}

}
